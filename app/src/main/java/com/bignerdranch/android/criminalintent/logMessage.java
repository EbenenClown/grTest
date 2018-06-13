package com.bignerdranch.android.criminalintent;

import android.util.Log;

public class logMessage {
    private String TAG = "testlog";

    public void setLog(String message){
        Log.i(TAG, message);
    }
}
