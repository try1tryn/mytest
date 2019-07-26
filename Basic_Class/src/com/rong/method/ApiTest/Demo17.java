package com.rong.method.ApiTest;
//面试题，除了数组在无返回的普通方法会改变数值，其余都不变
public class Demo17 {
    public static void main(String[] args) {
        int i = 10;
        fun(i);
        System.out.println("i:"+i); // ?

        int[] arr = {100};
        fun(arr);
        System.out.println("arr[0]"+arr[0]); // ?
    }

    public static void fun(int a) {
        a += 9000; // 修改a
        System.out.println(a); // 9010
    }

    public static void fun(int[] ints) {
        ints[0] = 9999;
        System.out.println(ints[0]);// 9999
    }
}