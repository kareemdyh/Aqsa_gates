package com.info.aqsagates1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivityesset : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activityesset)

var tv_name= findViewById<TextView>(R.id.tv_name)
var tv_status=findViewById<TextView>(R.id.tv_status)
var img_door=findViewById<ImageView>(R.id.img_esset)

        val dore= arrayOf(Doors("باب الرحمة ","مفتوح",R.drawable.gateofmercy),
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
   var abaot= arrayOf("باب مكون من بوابتين: الرحمة جنوبا والتوبة شماال. واسمه \n" +
           "يرجع لمقبرة الرحمة المالصقة له من الخارج، والتي تضم \n" +
           "قبري الصحابيين شداد بن أوس وعبادة بن الصامت","سم آخر هو باب ستي مريم، لقربه من كنيسة القديسة حنة \n" +
           "التي هي -حسب المعتقدات المسيحية- مكان ميالد السيدة \n" +
           ".مريم عليها السالم، وهي نفسها المدرسة الصالحية","مي حطة نسبة إلى اآلية الكريمة وقولوا حطة نغفر لكم س\n" +
           "خطاياكم، هذا الباب بسيط البناء، محكم الصنعة، مدخله \n" +
           "مستطيل، وتعلوه مجموعة من العالقات الحجرية، كانت فيما \n" +
           "مضى تستخدم لتعليق القناديل")
        val ert=intent.extras
val i= ert!!["i"].toString().toInt()
        val door = dore[i]
        tv_name.setText(door.name)
img_door.setImageResource(door.img)


    }
}