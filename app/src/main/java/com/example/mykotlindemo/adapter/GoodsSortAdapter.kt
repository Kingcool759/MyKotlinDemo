package com.example.mykotlindemo.adapter

import android.util.Log
import androidx.databinding.ViewDataBinding
import com.example.mykotlindemo.entity.Good
import me.tatarka.bindingcollectionadapter2.BindingRecyclerViewAdapter
import java.util.*

/**
 * @data on 3/31/21 6:38 PM
 * @auther KC
 * @describe
 */
class GoodsSortAdapter : BindingRecyclerViewAdapter<Good>() , OnItemMoveListener {
    var items = ArrayList<Good>()

    override fun onBindBinding(
        binding: ViewDataBinding,
        variableId: Int,
        layoutRes: Int,
        position: Int,
        item: Good
    ) {
        super.onBindBinding(binding, variableId, layoutRes, position, item)
        items.add(item)
        Log.d(
            "onBindBinding",
            "position:::--->" + position + "<---title:::" + item.name
        )
    }

    override fun onItemMove(fromPosition: Int, toPosition: Int) {
        val item:Good = items[fromPosition]
        items.removeAt(fromPosition)
        items.add(toPosition, item)
        notifyItemMoved(fromPosition, toPosition)
    }
}