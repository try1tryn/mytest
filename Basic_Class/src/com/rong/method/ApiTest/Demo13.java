package com.rong.method.ApiTest;

public class Demo13 {
    //StringBuiler()字符缓冲区
    //StringBuilder已经覆盖重写了Object当中的toString方法
    public static void main(String[] args) {
     StringBuilder s=new StringBuilder();
        s.append(12).append('s').append(true);
        System.out.println(s);
        String s2=s.toString();
        System.out.println(s2);
    }
}
