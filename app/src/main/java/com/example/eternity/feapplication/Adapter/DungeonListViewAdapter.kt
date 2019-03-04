package com.example.eternity.feapplication.Adapter

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.eternity.feapplication.Model.Dungeon
import kotlinx.android.synthetic.main.dungeon_listview_layout.view.*

public class DungeonListViewAdapter : BaseAdapter{
    private  var dungeonList : ArrayList<Dungeon> = ArrayList()
    private var mContext : Context? = null
    private var dungeonItemLayout : Int? = null

    constructor(dungeonList: ArrayList<Dungeon>, mContext: Context?, dungeonItemLayout: Int?) : super() {
        this.dungeonList = dungeonList
        this.mContext = mContext
        this.dungeonItemLayout = dungeonItemLayout
    }


    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var inflater : LayoutInflater = mContext!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        var mView : View = inflater.inflate(dungeonItemLayout!!,null)
        var dungeon = dungeonList[position]
        if( position % 2 == 1 ){
            mView.outLayout.setBackgroundColor(Color.parseColor("#ff0099cc"))
        }
        mView.dungeonName.text = dungeon.ShortName
        return mView
    }

    override fun getItem(position: Int): Any {
        return dungeonList[position]
    }

    override fun getItemId(position: Int): Long {
        return  position.toLong()
    }

    override fun getCount(): Int {
        return dungeonList.size
    }
}