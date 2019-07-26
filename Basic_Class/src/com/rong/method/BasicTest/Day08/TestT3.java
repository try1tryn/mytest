package com.rong.method.BasicTest.Day08;

public class TestT3 {
    //定义一个方法,接收一个字符串,找出字符串中三元组的个数
    // “三元组”是指一个连续出现的三次的字符，
    //返回给定字符串中三元组的个数，“三元组”是可以重叠的：“AAAAA”包含3个三元组
    public void getCount(String s){
        int count=0;
        for (int i = 0; i <s.length()-2 ; i++) {
            for (int j = i+1; j <=i+2 ; j++) {
                if(s.charAt(i)==s.charAt(j)){
                    if(j==i+2){
                        count++;
                        break;
                    }
                     continue;
                }
            }

        }
        System.out.println(s+"的三元组出现的次数为："+count);
    }
}
