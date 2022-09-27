package com.info.aqsagates1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import androidx.core.view.get

class MainActivity2 : AppCompatActivity() {
  lateinit var list1:ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        list1=findViewById(R.id.list1)


        val dor= arrayOf(Doors("باب الرحمة ","مفتوح",R.drawable.gateofmercy),
            Doors("باب الاسباط ","مفتوح",R.drawable.purgatorydoor),
            Doors("باب حطة ","مفتوح",R.drawable.babhuta),
            Doors("باب الغوانمة ","مفتوح",R.drawable.lionsgate),

            Doors("باب العتم ","مفتوح",R.drawable.darkdoor),
            Doors("باب الحديد ","مفتوح",R.drawable.irondoor),
            Doors("باب القطانين ","مفتوح",R.drawable.babalqatanin),
            Doors("باب امطهرة ","مفتوح",R.drawable.beholderdoor),
            Doors("باب السلسلة ","مفتوح",R.drawable.chaindoor),
            Doors("باب المغاربة ","مفتوح",R.drawable.moroccangate),
            Doors("باب الجنائز ","مغلق",R.drawable.funeraldoor),
            Doors("باب الثلاثي ","مغلق",R.drawable.tripledoor),
            Doors("باب المزدوج ","مغلق",R.drawable.doubledoor),
            Doors("باب المفرد ","مغلق",R.drawable.singledoor),


            )


        var a=CustomAdapter(this,R.layout.item,dor)
        list1.adapter=a

list1.setOnItemClickListener { adapterView, view, i, l ->
    list1.getItemAtPosition(i)
val intent=Intent(this,MainActivityesset::class.java)
    intent.putExtra("i",i)
startActivity(intent)


}
    }
}