package com.rong.method.ThreadTest;

public class T2 {
    //  用匿名内部类创建实现多线程实现Runnable接口
    public static void main(String[] args) {
        Runnable r=new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <10 ; i++) {
                    System.out.println(i);
                }
            }
        };
        new Thread(r).start();
        for (int i = 0; i <3 ; i++) {
            System.out.println("主方法线程");

        }
    }
}
