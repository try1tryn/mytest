package com.rong.method.ApiTest;

import java.text.*;

import java.util.Date;

public class Demo06 {
    public static void main(String[] args) throws ParseException {
        DateFormat df=new SimpleDateFormat("yyyy年MM月dd日");
        String s="2018年02月23日";
        Date date=df.parse(s);
        System.out.println(date);
    }

}
