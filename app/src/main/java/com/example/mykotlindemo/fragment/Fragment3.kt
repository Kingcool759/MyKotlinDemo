package com.example.mykotlindemo.fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mykotlindemo.databinding.Fragment3Binding
import com.example.mykotlindemo.utils.logd
import com.example.mykotlindemo.utils.toast


class Fragment3 : BaseFragment() {

    val tagStr = "Fragment3"

    val vBinding by lazy {
        Fragment3Binding.inflate(layoutInflater)
    }

    override fun setUserVisibleHint(isVisibleToUser: Boolean) {
        super.setUserVisibleHint(isVisibleToUser)
        logd(tagStr, "setUserVisibleHint  返回 $isVisibleToUser")
    }

    override fun onAttach(context: Context) {  //对应onDetach()
        super.onAttach(context)
        logd(tagStr,"onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {  //对应onDestroy()
        super.onCreate(savedInstanceState)
        logd(tagStr,"onCreate")
    }

    override fun onCreateView(  //对应onDestroyView()
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        logd(tagStr,"onCreateView")
        return vBinding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {  //无对应方法
        super.onActivityCreated(savedInstanceState)
        logd(tagStr,"onActivityCreated")
    }

    override fun onStart() {  //对应onStop()
        super.onStart()
        logd(tagStr,"onStart")
    }

    override fun onResume() {  //对应onPause()
        super.onResume()
        logd(tagStr,"onResume")
    }

    override fun onPause() {
        super.onPause()
        logd(tagStr,"onPause")
    }

    override fun onStop() {
        super.onStop()
        logd(tagStr,"onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        logd(tagStr,"onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        logd(tagStr,"onDestroy")
    }


    override fun onDetach() {
        super.onDetach()
        logd(tagStr,"onDetach")
    }

    //懒加载数据
    override fun initData() {
        toast("$tagStr 加载数据...")
    }
}