package com.rong.method.ApiTest;

import java.util.Date;
import java.text.*;
public class Demo05 {
    public static void main(String[] args) {
        // 创建日期对象，输出当前的时间
        System.out.println(new Date());
        // 创建日期对象，输出：将当前的毫秒值转成日期对象
        System.out.println(new Date(10L));
        DateFormat d=new SimpleDateFormat("yyyy‐MM‐dd HH:mm:ss");
        Date date=new Date();
        String str = d.format(date);
        System.out.println(str);

    }
}
