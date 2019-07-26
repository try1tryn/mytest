package com.rong.method.ThreadTest;

import com.rong.method.ThreadTest.MyThread;

public class T7 {
    //创建多线程对象，开启多线程
    // 在子线程中输出1-100之间的偶数，主线程输出1-100之间的奇数。
    public static void main(String[] args) {
        MyThread mt=new MyThread("多线程");
        mt.start();
        for(int i=1;i<=100;i+=2){
            System.out.println("main线程！"+i);
        }
    }

}
