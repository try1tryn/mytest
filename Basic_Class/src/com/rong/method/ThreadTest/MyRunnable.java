package com.rong.method.ThreadTest;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName() + "实现runnable接口的run方法");
        }
    }
}
