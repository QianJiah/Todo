package com.xujiaji.todo.helper;

import android.app.Activity;
import android.support.v4.content.ContextCompat;

import com.xujiaji.happybubble.BubbleLayout;
import com.xujiaji.todo.R;

/**
 * author: xujiaji
 * created on: 2018/11/29 15:48
 * description:
 */
public class BubbleCreator {

    public static BubbleLayout get(Activity activity) {
        BubbleLayout bl = new BubbleLayout(activity);
        bl.setShadowColor(ContextCompat.getColor(activity, R.color.colorAccent));
        return bl;
    }
}
