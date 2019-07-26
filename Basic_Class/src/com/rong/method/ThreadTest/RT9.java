package com.rong.method.ThreadTest;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RT9 implements Runnable{
    /**
     * 	请按要求编写多线程应用程序，模拟多个人通过一个山洞：
     * 		1.这个山洞每次只能通过一个人，每个人通过山洞的时间为5秒；
     *      2.随机生成10个人，同时准备过此山洞
     *      并且定义一个变量用于记录通过隧道的人数
     *      显示每次通过山洞人的姓名，和通过顺序；
     */

    private int nums=2;
    Lock lock=new ReentrantLock();
    @Override
    public void run() {
        if(nums>0){
            lock.lock();
            try{
                Thread.sleep(5000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread() + "已经通过隧道，TA是第" + (nums++) + "通过的！");
            lock.unlock();
        }

    }
}
