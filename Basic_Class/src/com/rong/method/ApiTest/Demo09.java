package com.rong.method.ApiTest;

import java.util.Random;
import java.util.Scanner;

public class Demo09 {
    /**
     * 实现:从str中随机获取一个字符，将该字符打印在控制台，并且统计该字符在str中出现的次数
     * 在main方法中完成以下要求，提示用户从控制台键盘录入一个字符串,调用found(String str)方法，在控制台输出返回的次数
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str = input.next();
        int num = found(str);
        System.out.println(num);
    }

    public static int found(String str) {
        Random r = new Random();
        char c = str.charAt(r.nextInt(str.length()));
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (c == str.charAt(i)) {
                count++;
            }
        }
        System.out.println("字符串中" + c + "的个数为" + count);
        return count;
    }

}