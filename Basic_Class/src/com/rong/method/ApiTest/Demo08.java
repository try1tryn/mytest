package com.rong.method.ApiTest;

public class Demo08 {
    public static void main(String[] args) {
         int a=1,count=0;
         while (true){
             if(a<8848000){
                 count++;
                 a=a*2;
             }else {
                 System.out.println(count);
                 break;
             }
         }
    }
}
