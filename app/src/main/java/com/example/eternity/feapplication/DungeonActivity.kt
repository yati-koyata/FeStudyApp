package com.example.eternity.feapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.eternity.feapplication.Adapter.DungeonListViewAdapter
import com.example.eternity.feapplication.Model.Dungeon
import kotlinx.android.synthetic.main.activity_dungeon.*

class DungeonActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dungeon)

        var dungeonList : ArrayList<Dungeon> = ArrayList()

        dungeonList.add(Dungeon(1,"基礎理論","aaaa",2))
        dungeonList.add(Dungeon(2,"アルゴリズムとプログラミング","aaa",2))
        dungeonList.add(Dungeon(3,"アルゴリズムとプログラミング","aaa",2))
        dungeonList.add(Dungeon(4,"システム構成要素","aaa",2))
        dungeonList.add(Dungeon(5,"ソフトウェア","aaa",2))
        dungeonList.add(Dungeon(6,"ハードウェア","aaa",2))
        dungeonList.add(Dungeon(7,"ヒューマンインターフェース","aaa",2))
        dungeonList.add(Dungeon(8,"マルチメディア","aaa",2))
        dungeonList.add(Dungeon(9,"データベース","aaa",2))
        dungeonList.add(Dungeon(10,"ネットワーク","aaa",2))
        dungeonList.add(Dungeon(11,"セキュリティ","aaa",2))
        dungeonList.add(Dungeon(12,"システム開発技術","aaa",2))
        dungeonList.add(Dungeon(13,"ソフトウェア開発管理技術","aaa",2))


        var dungeonArrayAdapter = DungeonListViewAdapter(dungeonList,this,R.layout.dungeon_listview_layout)

        dungeonListView.adapter = dungeonArrayAdapter

        //dungeonArrayAdapter.notifyDataSetChanged()

    }
}
