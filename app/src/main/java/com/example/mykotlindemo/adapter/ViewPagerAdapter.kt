package com.example.mykotlindemo.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mykotlindemo.R


/**
 * @data on 4/25/21 11:28 AM
 * @auther KC
 * @describe viewPager适配器
 */
class ViewPagerAdapter : RecyclerView.Adapter<ViewPagerAdapter.MyViewHolder>() {

    val colorList = ArrayList<Int>()

    init {
        colorList.add(R.color.blue)
        colorList.add(R.color.red)
        colorList.add(R.color.green)
        colorList.add(R.color.pink)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MyViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.viewpager_item, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.mTvTitle?.text = "item " + position;
        holder.itemView.setBackgroundResource(colorList[position]);
    }

    override fun getItemCount(): Int = colorList.size

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var mTvTitle: TextView? = itemView.findViewById(R.id.tvTitle)
    }
}
