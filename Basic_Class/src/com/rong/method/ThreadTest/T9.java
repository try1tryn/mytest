package com.rong.method.ThreadTest;

public class T9 {
    /**
     * 	请按要求编写多线程应用程序，模拟多个人通过一个山洞：
     * 		1.这个山洞每次只能通过一个人，每个人通过山洞的时间为5秒；
     *      2.随机生成10个人，同时准备过此山洞
     *      并且定义一个变量用于记录通过隧道的人数。显示每次通过山洞人的姓名，和通过顺序；
     */
    public static void main(String[] args) {
           Runnable r=new RT9();
           for(int i=0;i<10;i++){
           Thread t=new Thread(r,"人类");
           t.start();
               //System.out.println(Thread.currentThread());
    }
}}
