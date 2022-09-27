package com.info.aqsagates1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class MainActivityweb : AppCompatActivity() {
    lateinit var web_doors:WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activityweb)
        web_doors=findViewById(R.id.w1_doors)




        web_doors.settings.javaScriptEnabled
       web_doors.loadUrl("https://www.shorouknews.com/news/view.aspx?cdate=19052021&id=13141a13-37e7-4ce6-b0d4-48ee3df6d2f2")
















    }
}