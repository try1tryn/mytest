package com.rong.method.ApiTest;

import java.util.Calendar;
//Calender日历类
public class Demo10 {
    public static void main(String[] args) {
        Calendar calendar =Calendar.getInstance();
        calendar.set(calendar.YEAR,2020);
        int year=calendar.get(calendar.YEAR);
        int month=calendar.get(calendar.MONTH)+1;
        int day=calendar.get(calendar.DAY_OF_MONTH);
        System.out.println(year+"年——"+month+"月——"+day+"日");
        calendar.add(calendar.YEAR,-2);
        int year1=calendar.get(calendar.YEAR);
        System.out.println(year1+"年——"+month+"月——"+day+"日");

        /**
         * system.currentTimeMillis()
         * 就是 获取当前系统时间与1970年01月01日00:00点之间的毫秒差值
         */
        System.out.println(System.currentTimeMillis()/1000/60/60/24+"天");
    }
}
