package com.example.mykotlindemo.adapter

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.mykotlindemo.R
import com.example.mykotlindemo.entity.Fruit

/**
 * @data on 2020/9/21 3:55 PM
 * @auther
 * @describe
 */
class MainListViewAdapter(activity:Activity, val resourceId:Int, val data:List<Fruit>):
        ArrayAdapter<Fruit>(activity,resourceId,data) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = LayoutInflater.from(context).inflate(resourceId,parent,false)
        val main_Image:ImageView = view.findViewById(R.id.main_Image)
        val main_Title:TextView = view.findViewById(R.id.main_Title)
        val fruit = getItem(position)   //获取当前项的Fruit的实例
        if(fruit != null){
            main_Image.setImageResource(fruit.imageId)
            main_Title.text = fruit.name
        }
        return view
    }

    override fun getCount(): Int {
        return data.size
    }

    override fun getItem(position: Int): Fruit? {
        return data[position]
    }

}