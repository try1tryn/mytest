package com.rong.method.ApiTest;

import java.util.Calendar;

public class Demo16 {
    //用程序判断2018年2月14日是星期几
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        c.set(Calendar.YEAR, 2018);
        c.set(Calendar.MONTH, 1);
        c.set(Calendar.DATE, 14);
        //设置年
        int year = c.get(Calendar.YEAR);
        //设置月
        int month = c.get(Calendar.MONTH)+1;
        //设置日
        int date = c.get(Calendar.DATE);
        char week=getWeek(c.get(c.DAY_OF_WEEK));
        System.out.println(year+"年"+month+"月"+date+"日是星期"+week);
    }
    public static char getWeek(int a){
        char[] c = {' ','日','一','二','三','四','五','六'};
        return c[a];
    }
}
