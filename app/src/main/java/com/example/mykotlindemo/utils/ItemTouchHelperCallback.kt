package com.example.mykotlindemo.utils

import android.graphics.Color
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.mykotlindemo.R
import com.example.mykotlindemo.adapter.OnItemMoveListener

/**
 * @data on 3/31/21 5:20 PM
 * @auther KC
 * @describe RecyclerView拖拽重排序
 */
class ItemTouchHelperCallback : ItemTouchHelper.Callback() {
    override fun getMovementFlags(
        recyclerView: RecyclerView,
        viewHolder: RecyclerView.ViewHolder
    ): Int {
        val manager = recyclerView.layoutManager
        val dragFlags = if (manager is GridLayoutManager || manager is StaggeredGridLayoutManager) {
            ItemTouchHelper.UP or ItemTouchHelper.DOWN or ItemTouchHelper.LEFT or ItemTouchHelper.RIGHT
        } else {
            ItemTouchHelper.UP or ItemTouchHelper.DOWN
        }
        val swipeFlags = 0
        return makeMovementFlags(dragFlags, swipeFlags)
    }

    override fun onMove(
        recyclerView: RecyclerView,
        viewHolder: RecyclerView.ViewHolder,
        target: RecyclerView.ViewHolder
    ): Boolean {
        if (recyclerView.adapter is OnItemMoveListener) {
            val listener = recyclerView.adapter as OnItemMoveListener?
            listener!!.onItemMove(viewHolder.adapterPosition, target.adapterPosition)
        }
        return true
    }

    override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) { }

    override fun onSelectedChanged(viewHolder: RecyclerView.ViewHolder?, actionState: Int) {
        if (actionState !== ItemTouchHelper.ACTION_STATE_IDLE) {
            val title = viewHolder!!.itemView.findViewById<TextView>(R.id.tvTitle)
            title.setTextColor(Color.parseColor("#FF7028"))
            title.setBackgroundColor(Color.WHITE)
        }
        super.onSelectedChanged(viewHolder, actionState)
    }

    override fun clearView(recyclerView: RecyclerView, viewHolder: RecyclerView.ViewHolder) {
        super.clearView(recyclerView, viewHolder)
        val title = viewHolder.itemView.findViewById<TextView>(R.id.tvTitle)
        title.setTextColor(Color.parseColor("#333333"))
        title.setBackgroundColor(Color.parseColor("#eeeeee"));
    }
}

