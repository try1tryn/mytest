package com.rong.method.BasicTest.CommonTest;

import java.util.Scanner;

public class basicT6 {
    //键盘录入5个数字并存入数组中，遍历该数组，打印出数组中的最大值以及最大值的下标。
    public static void main(String[] args) {
        max();
    }
    public static void max(){
        Scanner input=new Scanner(System.in);
        int[] nums=new int[5];
        int maxNum=0,maxIndex=0;
        System.out.println("请输入五个整数：");
        for(int i=0;i<5;i++){
            nums[i]=input.nextInt();
            if(maxNum<nums[i]){
                maxNum=nums[i];
                maxIndex=i;
            }
        }
        System.out.println("整数中最大的数为"+maxNum+",下标为"+maxIndex);
    }
}
