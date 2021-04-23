package com.example.mykotlindemo.display

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.alibaba.android.arouter.facade.annotation.Route
import com.example.mykotlindemo.R
import com.example.mykotlindemo.arout.RouterPath
import com.example.mykotlindemo.databinding.ActivityKotlin09Binding
import com.example.mykotlindemo.viewmodel.Kotlin06ViewModel
import com.example.mykotlindemo.viewmodel.Kotlin09ViewModel

@Route(path = RouterPath.kotlin09)
class Kotlin09 : AppCompatActivity() {

    lateinit var binding: ActivityKotlin09Binding
    lateinit var viewModel: Kotlin09ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_kotlin09);
        viewModel = ViewModelProviders.of(this).get(Kotlin09ViewModel::class.java)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
    }
}