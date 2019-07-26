package com.rong.method.ApiTest;

public class Demo20 {
    /**
     * 分别使用String的 += 和StringBuilder的append方法对字符串做100000次拼接
     * 计算String拼接100000次花费时间与StringBuilder拼接100000次所花费时间并打印。
     */
    public static void main(String[] args) {
        long start=System.currentTimeMillis();
        getTime();
        long end=System.currentTimeMillis();
        System.out.println(end-start);
    }
    public static void getTime(){
        StringBuilder s=new StringBuilder("hello");
        for(int i=0;i<100000;i++){
            s.append("world");
        }
        String ss=s.toString();
    }
}
