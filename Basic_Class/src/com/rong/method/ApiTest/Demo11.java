package com.rong.method.ApiTest;

public class Demo11 {
    /*
     * 验证for循环打印数字1-9999所需要使用的时间
     */
    public static void main(String[] args) {
        long start=System.currentTimeMillis();
        for(int i=1;i<=9999;i++){
            System.out.println(i);
        }
        long end=System.currentTimeMillis();
        System.out.println("一共耗时："+(end-start)); }
}
