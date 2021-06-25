package com.example.mykotlindemo.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.util.AttributeSet;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;

import com.example.mykotlindemo.R;

/**
 * @data on 2021/6/25 3:51 下午
 * @auther KC
 * @describe TextView添加图片
 */
public class TextViewAsImage extends AppCompatTextView {

    private Bitmap mBitmap;

    public TextViewAsImage(Context context) {
        super(context);
    }

    public TextViewAsImage(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        mBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.user_img);
        setTextSize(40);
    }

    public TextViewAsImage(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawBitmap(mBitmap, 0, 0, getPaint());
    }
}
