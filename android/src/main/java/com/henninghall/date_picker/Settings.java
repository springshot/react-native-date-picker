package com.henninghall.date_picker;


import android.text.format.DateFormat;

public class Settings {

    public static boolean usesAmPm (){
    	// We always want 24 Hours format
    	return false;
        // return !DateFormat.is24HourFormat(DatePickerManager.context);
    }

}
