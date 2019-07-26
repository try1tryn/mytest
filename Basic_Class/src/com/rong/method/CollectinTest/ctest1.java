package com.rong.method.CollectinTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class ctest1 {
    //给定以下代码，请定义方法listTest()统计集合中指定元素出现的次数
    // 如"a": 2,"b": 2,"c" :1, "xxx":0。
    public static void main(String[] args) {
        listTest('a');
    }
    public static void listTest(char a) {
        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String ss = input.next();
        Collection<String> c = new ArrayList<String>();
        c.add(ss);
        for (String s : c) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == a) {
                    count++;
                }

            }
            System.out.println(a + "出现的次数为：" + count);
        }
    }}
