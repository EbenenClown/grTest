package com.bignerdranch.android.criminalintent;

import android.content.Context;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateFormater {

    public static String formatDate(Date formatedDate){
        DateFormat dateFormat = java.text.DateFormat.getDateInstance(DateFormat.MEDIUM);
            return dateFormat.format(formatedDate);
    }

    public static String formateTime(Date formatedDate){
        DateFormat dateFormat = java.text.DateFormat.getDateInstance(DateFormat.HOUR0_FIELD);
        return dateFormat.format(formatedDate);

    }
}
