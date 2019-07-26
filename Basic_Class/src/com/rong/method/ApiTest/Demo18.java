package com.rong.method.ApiTest;

import java.util.Random;

public class Demo18 {
    /**
     * 定义 getNewArr()静态方法:要求传入一个int类型的数组arr,遍历数组，
     * 将数组中小于10的元素替换成0，然后返回修改之后的数组在main方法中完成:
     * 定义一个长度为5的int类型的数组
     * 随机生成5个随机数存入数组(随机数的范围为5到50,包括5和50)先不使用随机数直接赋值即可，
     * 并把数组中的元素打印在控制台
     * 调用getNewArr方法,在控制台打印返回后的数组中的元素
     */
    public static void main(String[] args) {
        getNewArr();
    }
    public static void getNewArr(){
        Random r=new Random();
        int [] arr=new int [5];
        System.out.println("随机数组为:");
        for(int i=0;i<5;i++){
            arr[i]=r.nextInt(50)+5;
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("调用方法后的数组为：");
        for(int i=0;i<5;i++){
            if(arr[i]<10){
                arr[i]=0;

            }
            System.out.print(arr[i]+" ");
        }


    }
}
