package com.rong.method.BasicTest.Day10;

import java.util.Scanner;

/**
 *  1)重写controlTV方法：
 *          * 方法内输出"手机开启红外功能,控制电视"；
 *          * 提示用户键盘录入电视节目信息并接受；
 *          * 调用电视play方法,将节目信息作为参数传入；
 */
public class Phone implements RedRay {
    @Override
    public void controlTV(TV tv) {
        System.out.println("手机开启红外功能,控制电视");
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入电视信息");
        String s=sc.next();
        tv.play(s);
    }

}
