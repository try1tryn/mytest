package com.rong.method.BasicTest.CommonTest;

import java.util.Arrays;

public class basicT3 {
    /**
     * 	(1)模拟Arrays.toString(int[] arr);方法
     * 	自己封装一个public static String toString(int[] arr);
     * 	(2)如果int类型数组arr为null，toString方法返回字符串"null"
     * 	(3)如果int类型数组arr长度为0，toString方法返回字符串"[]"
     * 	(4)如果int类型数组arr的内容为{1,2,3,4,5},toString方法返回字符串"[1, 2, 3, 4, 5]"
     */
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        String s=toString(arr);
        System.out.println(s);
    }
    public static String toString(int[] arr){
        String str="{";
            if(arr==null)
                return "null";

            if(arr.length==0)
                return "[]";

            if(arr.length>0){
                for(int i=0;i<arr.length;i++) {
                    if(i!=arr.length-1){
                        str+=arr[i]+",";
                    }else str+=arr[i]+"}";
                }
            }
            return str;
    }
}
