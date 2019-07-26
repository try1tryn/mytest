package com.rong.method.BasicTest.CommonTest;

import java.util.Arrays;
import java.util.Random;

/**
    定义一个长度为5的int型数组，之后生成5个随机数存入数组，
	随机数范围为20到80（包含20和80），遍历数组
    将数组中小于60的元素替换成9，之后打印修改后的数组
 */
public class basicT4 {
    public static void main(String[] args) {
        fun();
    }
    public static void fun(){
        Random r=new Random();
        int[] nums=new int[5];
        for(int i=0;i<nums.length;i++){
            nums[i]=r.nextInt(61)+20;
            if(nums[i]<60){
                nums[i]=9;
            }

        }
        System.out.println(Arrays.toString(nums));
    }
}
