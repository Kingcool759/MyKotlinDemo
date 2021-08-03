package com.example.mykotlindemo.fragment

import android.view.View
import com.alibaba.android.arouter.facade.annotation.Autowired
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.example.mykotlindemo.base.BaseMvvMFragment
import com.example.mykotlindemo.databinding.FragmentCommonBinding
import com.example.mykotlindemo.viewmodel.Kotlin37ViewModel

@Route(path = "/common/fragment")
class CommonFragment : BaseMvvMFragment<FragmentCommonBinding,Kotlin37ViewModel>() {

    @JvmField
    @Autowired
    var tab = ""

    override fun onLoad(view: View) {
        ARouter.getInstance().inject(this)
        super.onLoad(view)
        dataBinding.textView.text = "Fragment$tab"
    }
}