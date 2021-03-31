package com.example.mykotlindemo.adapter

/**
 * @data on 3/31/21 7:00 PM
 * @auther KC
 * @describe
 */
interface OnItemMoveListener {
    /**
     * Item移动后 触发
     */
    fun onItemMove(fromPosition: Int, toPosition: Int)
}