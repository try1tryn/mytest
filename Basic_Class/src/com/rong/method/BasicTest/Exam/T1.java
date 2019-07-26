package com.rong.method.BasicTest.Exam;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class T1 {
    /**
     * 按要求在main方法中完成以下功能：
     * 定义一个长度为5的int型数组arr，数组元素为1-99（范围包含1和99）之间的随机数；
     * 遍历数组arr，打印所有数组元素；
     * 提示用户输入2-5之间的一个数字num（num范围包括2和5,不需要代码判断）；
     * 筛选出数组中元素是num倍数的数组元素并输出。
     */
    public static void main(String[] args) {
        int [] nums=new int[5];

        Random r=new Random();
        for (int i = 0; i <nums.length ; i++) {
             nums[i]=r.nextInt(99)+1;
        }
        System.out.println(Arrays.toString(nums));
        Scanner input=new Scanner(System.in);
        System.out.println("提示用户输入2-5之间的一个数字,范围在2-5之间：");
        int num=input.nextInt();
        System.out.println(num+"的倍数为：");
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]%num==0){
                System.out.print(nums[i]+" ");
            }
        }
    }
}
