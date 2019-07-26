package com.rong.method.ThreadTest;

import java.util.concurrent.Callable;

public class CallableT implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int sum=0;
        for (int i = 0; i <= 100; i++) {
            sum+=i;
        }
        return sum;
    }
}
