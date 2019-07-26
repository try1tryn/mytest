package com.rong.method.BasicTest.Day08;

public class TestT2 {
    //提示用户输入一串字符串(不包含空格)
    // 分别统计出其中英文字母,数字和其他字符的个数并打印出来
    int enums=0;
    int nums=0;
    int itsnums=0;
    public void getNum(String s){
        for (int i = 0; i < s.length() - 1; i++) {
            if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
                nums++;
            }
            else if((s.charAt(i)>='A'&&s.charAt(i)<='Z')||(s.charAt(i)>='a'&&s.charAt(i)<='z')){
                enums++;
            }
            else itsnums++;
        }
        System.out.println("英文字母出现的次数为"+enums);
        System.out.println("数字出现的次数为"+nums);
        System.out.println("其他字符出现的次数为"+itsnums);
    }

}
