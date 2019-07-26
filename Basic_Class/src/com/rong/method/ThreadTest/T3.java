package com.rong.method.ThreadTest;

public class T3 {
    public static void main(String[] args) {
        Ticket t=new Ticket();
        Thread t1=new Thread(t,"窗口一");
        Thread t2=new Thread(t,"窗口二");
        Thread t3=new Thread(t,"窗口三");

        t1.start();
        t2.start();
        t3.start();
    }
}
