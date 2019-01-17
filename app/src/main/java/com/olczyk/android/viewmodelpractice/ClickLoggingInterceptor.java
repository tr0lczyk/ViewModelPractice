package com.olczyk.android.viewmodelpractice;

import android.util.Log;

public class ClickLoggingInterceptor {

    private static final String TAG = "ClickLoggingInterceptor";

    public void intercept(int clickCount){
        Log.d(TAG,"processed click " + clickCount);
    }
}
