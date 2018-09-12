package com.sahelsd.rep;

import android.util.Log;

public class LogBekooo {

    private static final String TAG = "LogBekooo";

    public static void bekooo(String xxx) {
        Log.e(TAG, xxx);
    }

    public static int bekooo2(int xxx) {
        int x = xxx;
        int res = x * 5;
        return res;
    }
}
