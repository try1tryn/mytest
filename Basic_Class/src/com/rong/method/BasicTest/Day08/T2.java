package com.rong.method.BasicTest.Day08;

import java.util.Scanner;

public class T2 {
    //提示用户输入一串字符串(不包含空格)
    // 分别统计出其中英文字母,数字和其他字符的个数并打印出来
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请您输入一串字符串：");
        String s=input.next();
        TestT2 t=new TestT2();
        t.getNum(s);
    }
}
