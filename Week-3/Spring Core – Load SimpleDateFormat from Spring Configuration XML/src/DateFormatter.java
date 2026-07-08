package com.cognizant.springcore;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatter {

    private SimpleDateFormat simpleDateFormat;

    public void setSimpleDateFormat(SimpleDateFormat simpleDateFormat) {
        this.simpleDateFormat = simpleDateFormat;
    }

    public void displayCurrentDate() {
        String date = simpleDateFormat.format(new Date());
        System.out.println("Current Date : " + date);
    }
}
