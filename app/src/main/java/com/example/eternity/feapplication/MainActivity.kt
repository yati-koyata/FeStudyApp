package com.example.eternity.feapplication

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //スタートボタンをクリック処理
        startButton.setOnClickListener {
            var intent : Intent = Intent(this,DungeonActivity::class.java)
            startActivity(intent)
        }


    }
}
