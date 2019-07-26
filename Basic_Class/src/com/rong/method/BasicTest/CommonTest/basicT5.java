package com.rong.method.BasicTest.CommonTest;

public class basicT5 {
    /**
     * 求1~10以内(包含1和10)能被2整除但是不能被3整除的数的和，并将求出的和打印到控制台上。
     */
    public static void main(String[] args) {
        fun();
    }
    public static void fun(){
        int sum=0;
        for(int i=0;i<=10;i++){
            if(i%2==0&&i%3!=0){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
