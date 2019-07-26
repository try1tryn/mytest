package com.rong.method.ApiTest;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
public class Demo15 {
    //请用代码实现:获取当前的日期,并把这个日期转换为指定格式的字符串,如2088-08-08 08:08:08。
        public static void main(String args[]) throws ParseException{
            DateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date d=new Date();
            String now=df.format(d);
            //输出当前时间
            System.out.println(now);
            //将时间输出格式转换一下
            d=df.parse(now);
            DateFormat df2=new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
            String now2=df2.format(d);
            System.out.println(now2);
        }



}
