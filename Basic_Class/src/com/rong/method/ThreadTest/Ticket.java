package com.rong.method.ThreadTest;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Ticket implements Runnable {
    //同步方法
    private int ticket=100;
    Lock lock=new ReentrantLock();
    @Override
    public void run() {
        //每个窗口卖票的操作
        // 窗口 永远
        while (true){
               lock.lock();
               if(ticket>0){
                   try{
                       Thread.sleep(100);

                   }catch (InterruptedException e){
                       e.printStackTrace();
                   }
                   String name=Thread.currentThread().getName();
                   System.out.println(name+"正在卖："+ticket--);
               }
               lock.unlock();
        }
    }
    /** 同步代码块
    public synchronized void sellTicket(){
            if(ticket>0){
                try {
                    Thread.sleep(100);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                String name=Thread.currentThread().getName();
                System.out.println(name+"正在卖:"+ticket--);
            }}*/

    }

