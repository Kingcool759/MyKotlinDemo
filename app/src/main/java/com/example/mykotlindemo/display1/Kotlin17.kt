package com.example.mykotlindemo.display1

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.facade.annotation.Route
import com.bumptech.glide.Glide
import com.example.mykotlindemo.arout.RouterPath
import com.example.mykotlindemo.databinding.ActivityKotlin17Binding
import com.example.mykotlindemo.glide.GlideEngine
import com.example.mykotlindemo.utils.ContextUtils
import com.luck.picture.lib.PictureSelector
import com.luck.picture.lib.config.PictureConfig
import com.luck.picture.lib.config.PictureMimeType

@Route(path = RouterPath.kotlin17)
class Kotlin17 : AppCompatActivity() {
    val vBinding by lazy {
        ActivityKotlin17Binding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(vBinding.root)
        vBinding.imageView.setOnClickListener{
            uploadImg(vBinding.imageView)
        }
    }

    fun uploadImg(view: View) {
        PictureSelector.create(ContextUtils.toActivity(view.context))
            .openGallery(PictureMimeType.ofImage())// 全部.PictureMimeType.ofAll()、图片.ofImage()、视频.ofVideo()、音频.ofAudio()
            .maxSelectNum(1)// 最大选择数量
            .minSelectNum(1)// 最小选择数量
            .imageSpanCount(3)// 每行显示个数
            .selectionMode(PictureConfig.MULTIPLE)// 多选 or 单选PictureConfig.MULTIPLE : PictureConfig.SINGLE
            .isPreviewImage(true)// 是否可预览图片
            .isCamera(true)// 是否显示拍照按钮
            .isZoomAnim(true)// 图片列表点击 缩放效果 默认true
            .imageEngine(GlideEngine.createGlideEngine())
            //.setOutputCameraPath("/CustomPath")// 自定义拍照保存路径
            .isEnableCrop(false)// 是否裁剪
            .isCompress(true)// 是否压缩
            //.sizeMultiplier(0.5f)// glide 加载图片大小 0~1之间 如设置 .glideOverride()无效
            .glideOverride(160, 160)// glide 加载宽高，越小图片列表越流畅，但会影响列表图片浏览的清晰度
            .withAspectRatio(1, 1)// 裁剪比例 如16:9 3:2 3:4 1:1 可自定义
            //.selectionMedia(selectList)// 是否传入已选图片
            //.previewEggs(false)// 预览图片时 是否增强左右滑动图片体验(图片滑动一半即可看到上一张是否选中)
            .videoMaxSecond(60)//视频最大秒数
            .rotateEnabled(false) // 裁剪是否可旋转图片
            .forResult(PictureConfig.CHOOSE_REQUEST)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == PictureConfig.CHOOSE_REQUEST) {  // 图片选择结果回调

            val localMedia = PictureSelector.obtainMultipleResult(data)
//            val morePics = ArrayList<String>()
//            localMedia.forEach {
//                morePics.add(it.compressPath)
//            }

            Glide.with(applicationContext).load(localMedia[0].realPath).into(vBinding.imageView)
        }
    }
}