package com.example.mykotlindemo.view;

/**
 * @data on 4/1/21 5:16 PM
 * @auther
 * @describe
 */

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/**
 * 最简单的背景色
 * Created by M.C/酸奶 on 2015/12/6.
 */
public class SuqStateDrawable extends Drawable {

    private Paint mPaint;

    /**
     * 构造定个颜色
     * @param color
     */
    public SuqStateDrawable(int color) {

        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPaint.setColor(color);
        mPaint.setStrokeWidth(5);
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setAntiAlias(true);
    }

    public void setColor(int color) {
        mPaint.setColor(color);
        invalidateSelf();  //重新上色记得重绘
    }

    /**
     * 绘制的时候把颜色画上去
     * @param canvas
     */
    @Override
    public void draw(Canvas canvas) {
        canvas.drawPaint(mPaint);
    }

    @Override
    public void setAlpha(int alpha) {
        mPaint.setAlpha(alpha);
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        mPaint.setColorFilter(colorFilter);
    }

    @Override
    public int getOpacity() {
        return 0;
    }
}