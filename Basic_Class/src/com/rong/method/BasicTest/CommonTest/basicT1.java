package com.rong.method.BasicTest.CommonTest;

import java.util.Arrays;

import static java.lang.Integer.parseInt;

public class basicT1 {
    /**
     * 有一个数字字符串"25 11 -6 20 102 9",数字之间用空格间隔
     * 对这串数字按照从小到大排序，生成一个数值有序的字符串"-6 9 11 20 25 102"
     * 提示:用String类提供的split方法(用" "(空格)作为split方法的参数来切割)
     * 然后生成对应的数字字符串数组
     */
    public static void main(String[] args) {
        fun();
    }
    public static void fun() {
        String ns = "25 11 -6 20 102 9";
        String[] nums = ns.split(" ");
        int[] num = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            num[i] = parseInt(nums[i], 10);
        }
         Arrays.sort(num);
         System.out.println(Arrays.toString(num));


        }
    }


