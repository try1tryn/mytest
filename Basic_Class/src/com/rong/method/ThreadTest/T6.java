package com.rong.method.ThreadTest;

import com.rong.method.ThreadTest.MyThread;

public class T6 {
    //创建多线程对象，开启多线程
    public static void main(String[] args) {
      MyThread t=new MyThread("新的线程");
      t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("main线程！"+i);
        }
    }
}
