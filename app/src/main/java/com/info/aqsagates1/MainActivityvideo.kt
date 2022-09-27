package com.info.aqsagates1

import android.content.Context
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView

class MainActivityvideo : AppCompatActivity() {
    lateinit var vv_doors:VideoView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activityvideo)

        vv_doors=findViewById(R.id.vv_doors)

       vv_doors.setVideoURI(Uri.parse("android.resource://$packageName/${R.raw.aqsavedio}"))
vv_doors.start()
val mediaControll=MediaController(this)
vv_doors.setMediaController(mediaControll)



    }
}