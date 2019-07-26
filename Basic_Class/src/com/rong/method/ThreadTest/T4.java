package com.rong.method.ThreadTest;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class T4 {
    public static void main(String[] args) {
        CallableT ct=new CallableT();
        //1.执行 Callable 方式，需要 FutureTask 实现类的支持，用于接收运算结果。
        FutureTask<Integer> result=new FutureTask<>(ct);
        Thread t=new Thread(result,"callabe接口");
        t.start();
        //接受运算后的结果
        try {
            Integer sum=result.get();
            System.out.println(sum);
        }catch (InterruptedException | ExecutionException e){
            e.printStackTrace();
        }
    }
}
