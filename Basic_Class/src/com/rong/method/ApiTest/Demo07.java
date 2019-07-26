package com.rong.method.ApiTest;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Demo07 {
    /**
     * 请使用日期时间相关的API，计算出一个人已经出生了多少天
     * 1.获取当前时间对应的毫秒值
     * 2.获取自己出生日期对应的毫秒值
     * 3.两个时间相减（当前时间– 出生日期）
     */
    public static void main(String[] args) throws ParseException {
        //显示当前时间
        DateFormat df=new SimpleDateFormat("yyyy年MM月dd日");
        Date date = new Date();
        String nowdate=df.format(date);
        //用户输入生日
        Scanner input=new Scanner(System.in);
        System.out.println("请输入您的生日");
        String bir=input.next();
        //
        Date date2=df.parse(bir);
        Date data3=df.parse(nowdate);
        long bir2=date2.getTime();
        long now2=data3.getTime();
        long num=now2-bir2;
        System.out.println("当时时间为"+nowdate);
        if(num<0){
            System.out.println("还没出生");
        }else
        System.out.println("您已经出生:"+(num/1000/60/60/24)+"天");
    }
}
