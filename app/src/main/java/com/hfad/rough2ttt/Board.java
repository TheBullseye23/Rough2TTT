package com.hfad.rough2ttt;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

public class Board extends View {

    private Rect mRect;
    private Paint mPaint;



    public Board(Context context) {
        super(context);
    }

    public Board(Context context,  AttributeSet attrs) {
        super(context, attrs);
    }

    public Board(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public Board(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    private void  init()
    {
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPaint.setColor(R.color.myYellow);
        mPaint.setStyle(Paint.Style.STROKE);


    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int mWidth = canvas.getWidth();
        int mHeigth = canvas.getHeight();
        canvas.drawLine(mWidth/3,0,mWidth/3,mHeigth,mPaint);
        invalidate();
    }
}
