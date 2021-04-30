package com.example.mykotlindemo.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.alibaba.android.arouter.facade.annotation.Autowired
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.example.mykotlindemo.R
import com.example.mykotlindemo.utils.toast

@Route(path = "/kc/fragmentOne")
class FragmentOne : BaseFragment() {

    @JvmField
    @Autowired
    var oneStr: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ARouter.getInstance().inject(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_5, container, false)
    }

    override fun initData() {
        super.initData()
        toast(oneStr.toString())
    }
}