package com.rong.method.ThreadTest;

public class ThreadT5 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"子线程执行");
        }

    }
}
