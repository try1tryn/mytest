package com.rong.method.CollectinTest;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Test3 {
    /**
     * 键盘录入一个字符串，去掉其中重复字符
     * 打印出不同的那些字符，必须保证顺序
     * 例如输入：aaaabbbcccddd，打印结果为：abcd。*/
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入字符串：");
        String s=input.next();
        LinkedList<Character> list=new LinkedList<>();
        char[] chars=s.toCharArray();
        for(Character c:chars){
            if(!list.contains(c)){
                list.add(c);
            }
        }
        Collections.sort(list);
        System.out.println(list);

    }
}
