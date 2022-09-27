package com.info.aqsagates1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
   lateinit var b_door_show:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
  b_door_show=findViewById(R.id.b_door_show)

var b_door_web=findViewById<Button>(R.id.b_door_web)
        b_door_web.setOnClickListener {
            val intent= Intent(this,MainActivityweb::class.java)
            startActivity(intent)
        }
var b_scroll=findViewById<Button>(R.id.b_scrool)
        b_scroll.setOnClickListener {
            val intent= Intent(this,MainActivityscroll::class.java)
            startActivity(intent)

        }

var b_doors_videos=findViewById<Button>(R.id.b_doors_video)
        b_doors_videos.setOnClickListener {
            val intent= Intent(this,MainActivityvideo::class.java)
            startActivity(intent)

        }


        b_door_show.setOnClickListener {
            val intent= Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }

    }
}