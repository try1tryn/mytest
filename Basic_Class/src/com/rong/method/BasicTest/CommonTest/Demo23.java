package com.rong.method.BasicTest.CommonTest;

public class Demo23 {
    //打印直角三角形
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
             for(int j=4;j>=i;j--){
                 System.out.print("*");
             }
            System.out.println();
        }
    }
}
