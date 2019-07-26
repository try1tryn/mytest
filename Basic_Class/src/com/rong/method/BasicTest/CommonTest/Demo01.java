package com.rong.method.BasicTest.CommonTest;

public class Demo01 {
    /**
     *定义一个方法传入3个整数, 如果三个数都不相同则返回0； 
     * 如果所有的数字都相同则返回20；如果只有两个数字相同则返回10.
     */
    public static void main(String[] args) {
        int e=isEqual(3,3,1);
        System.out.println(e);
    }
    public static int isEqual(int a,int b,int c){
        if(a==b&&b==c)
            return 20;
        else if(a==b||b==c||a==c)
             return 10;
        else return 0;
    }

}
