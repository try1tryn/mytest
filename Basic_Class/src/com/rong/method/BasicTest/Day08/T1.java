package com.rong.method.BasicTest.Day08;

import java.util.Scanner;

public class T1 {
    /**
     * 编写一个Java程序，提示用户输入一串字符串，要求字符串中必须存在字母（需要代码判断）
     * 1.若不符合要求，则提示用户重新输入直至符合要求为止
     * 2.若符合要求，则判断字符串中大写字母出现次数并打印。
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请您输入一串字符串");
        String s = input.next();
        TestT1 t=new TestT1();
        t.fun1(s);
    }

}
