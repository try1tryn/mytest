package com.rong.method.BasicTest.CommonTest;

public class Demo02 {
    public static void main(String[] args) {
         getName();
    }
    /**
     * 求100以内所有的素数(素数:只能被1和本身整除,例如2,3,5,7...) 有难度最后做
     * 	(1)遍历1~100之间的所有整数
     * 	(2)通过判断获得素数并输出
     */
    public static void getName(){
        for(int i=1;i<=100;i++){
            int count=0;
            for(int j=1;j<=i;j++){
                if(i%j==0) count++;
            }
            if(count==2){
                System.out.println(i);
            }
        }

    }
}
