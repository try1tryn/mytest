package com.rong.method.ThreadTest;

public class MyThread extends Thread{
    //继承Thread类
    public MyThread(String name){
        super(name);
    }
    public void run(){
        for(int i=2;i<=100;i+=2){
            System.out.println(getName()+"：正在执行！"+i);

        }
    }
}
