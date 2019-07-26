package com.rong.method.BasicTest.Day08;

import java.util.Scanner;

public class T3 {
    //定义一个方法,接收一个字符串,找出字符串中三元组的个数
    // “三元组”是指一个连续出现的三次的字符，
    //返回给定字符串中三元组的个数，“三元组”是可以重叠的：“AAAAA”包含3个三元组
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请您输入一串字符串：");
        String s=input.next();
        TestT3 t=new TestT3();
        t.getCount(s);
    }
}
