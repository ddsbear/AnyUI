package com.dds.anyui;

import android.content.Context;
import android.view.MotionEvent;

/**
 * Created by dds on 2020/6/23.
 */
public class TestButton extends androidx.appcompat.widget.AppCompatButton {

    public TestButton(Context context) {
        super(context);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return super.onTouchEvent(event);
    }
}
