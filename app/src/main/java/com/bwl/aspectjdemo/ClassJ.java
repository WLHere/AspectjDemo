package com.bwl.aspectjdemo;

import android.util.Log;

import com.bwl.libaspectj.annotation.DebugTrace;


/**
 * Created by baiwenlong on 2020/6/16
 */
public class ClassJ {
    @DebugTrace
    public void doSomething() {
        Log.d("bwl", "doSomething");
        try {
            Thread.sleep(300);
        } catch (InterruptedException ignored) {
        }
    }
}
