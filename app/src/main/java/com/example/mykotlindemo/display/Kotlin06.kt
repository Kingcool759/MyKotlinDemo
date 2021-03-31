package com.example.mykotlindemo.display

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.ItemTouchHelper
import com.alibaba.android.arouter.facade.annotation.Route
import com.example.mykotlindemo.R
import com.example.mykotlindemo.arout.RouterPath
import com.example.mykotlindemo.databinding.ActivityKotlin06Binding
import com.example.mykotlindemo.utils.ItemTouchHelperCallback
import com.example.mykotlindemo.viewmodel.Kotlin06ViewModel

@Route(path = RouterPath.kotlin06)
class Kotlin06 : AppCompatActivity() {

    private lateinit var binding:ActivityKotlin06Binding
    private lateinit var viewModel:Kotlin06ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_kotlin06);
        viewModel = ViewModelProviders.of(this).get(Kotlin06ViewModel::class.java)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this

        val callback = ItemTouchHelperCallback()
        val helper = ItemTouchHelper(callback)
        helper.attachToRecyclerView(binding.mRecycler)
    }
}