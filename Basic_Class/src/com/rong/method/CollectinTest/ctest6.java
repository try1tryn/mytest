package com.rong.method.CollectinTest;

import java.util.ArrayList;
import java.util.Random;

public class ctest6 {
    //产生10个1-100的随机数，并放到一个数组中
    // 把数组中大于等于10的数字放到一个list集合中，并打印到控制台
    public static void main(String[] args) {
        print();
    }
    public  static void print(){
        Random r=new Random();
        int[] nums=new int[10];
        ArrayList<Integer> list=new ArrayList<>();
        System.out.println("数组：");
        for(int i=0;i<nums.length;i++){
            nums[i]=r.nextInt(100)+1;
            System.out.print(nums[i]+" ");
            if(nums[i]>=10){
            list.add(nums[i]);
            }
        }
        System.out.println();
        System.out.println("大于10的集合");
        System.out.println(list);

    }
}
