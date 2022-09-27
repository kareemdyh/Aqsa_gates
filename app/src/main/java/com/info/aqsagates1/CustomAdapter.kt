package com.info.aqsagates1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomAdapter(context: Context, private val resource: Int, private val objects: Array<out Doors>) :
    ArrayAdapter<Doors>(context, resource, objects) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {



        val l= LayoutInflater.from(context)

        val Customrow=l.inflate(resource,null)
        val tv_door_name: TextView =Customrow.findViewById(R.id.tv_door_name)
        val tv_door_state: TextView =Customrow.findViewById(R.id.tv_door_status)
        val photo: ImageView =Customrow.findViewById(R.id.img_image)
        val dors=objects[position]
        tv_door_name.text=dors.name
        tv_door_state.text=dors.states
        photo.setImageResource(dors.img)
        return Customrow






    }
}