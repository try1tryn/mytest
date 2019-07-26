package com.rong.method.ThreadTest;

public class T5 {
    //编写程序，在主线程中，循环输出“主线程执行”；
    // 在一条新线程中，循环输出“子线程执行”
    public static void main(String[] args) {
        ThreadT5 tt=new ThreadT5();
        Thread t=new Thread(tt,"哈哈");
        t.start();
        System.out.println("主线程执行");
    }

}
