package com.example.mykotlindemo.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.mykotlindemo.R

/**
 * @data on 2020/9/25 9:05 AM
 * @auther
 * @describe
 */
class RecyclerAdapter(textList: ArrayList<String>) :
    RecyclerView.Adapter<RecyclerAdapter.MyViewHolder>() {

    private val textList: ArrayList<String>? = textList

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RecyclerAdapter.MyViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.recycler_item, parent, false)
        val viewHolder = RecyclerAdapter.MyViewHolder(view)
        return viewHolder
    }

    override fun getItemCount(): Int = textList?.size ?: 0

    override fun onBindViewHolder(holder: RecyclerAdapter.MyViewHolder, position: Int) {
        val textpot = textList?.get(position)
        holder.title.text = textpot
        holder.itemView.setOnClickListener {
            Toast.makeText(holder.itemView.context, "${holder.title.text}", Toast.LENGTH_SHORT)
                .show()
        }
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title: TextView = itemView.findViewById(R.id.mine_title)
    }
}