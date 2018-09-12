package com.sahelsd.rep;

import android.content.Context;
import android.content.Intent;
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

    public static void noorpayy(Context context) {
        Intent intent = new Intent(context, NoorPay.class);
        context.startActivity(intent);
    }
}
