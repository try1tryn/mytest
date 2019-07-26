package com.rong.method.ApiTest;

public class Demo14 {
    public static void main(String[] args) {
        //使用构造函数
        Integer i=new Integer(4);
        //使用包装类中的valueOf方法
        Integer i2=Integer.valueOf(4);
        System.out.println(i+"   "+i2);
        int num = i.intValue();
        System.out.println(num);
        //String转换成对应的基本
      long c=Long.parseLong("1002");
        System.out.println(c);
    }
}
