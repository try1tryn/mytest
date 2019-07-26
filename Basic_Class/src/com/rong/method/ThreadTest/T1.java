package com.rong.method.ThreadTest;

public class T1 {
    //多线程实现Runnable接口
    public static void main(String[] args) {
        //实例化
        MyRunnable mr=new MyRunnable();

        Thread t=new Thread(mr,"哈哈");
        //开启线程
        t.start();

        for(int i=0;i<3;i++){
            System.out.println("主方法");
        }
    }
}
