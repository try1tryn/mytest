package com.rong.method.BasicTest.Day10;

import java.util.Scanner;

public class RemoteControl {
    void controlTV(TV tv){
        System.out.println("遥控器控制电视");
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入电视信息");
        String s=sc.next();
        tv.play(s);
    }
}
