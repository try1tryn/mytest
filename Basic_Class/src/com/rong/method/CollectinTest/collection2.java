package com.rong.method.CollectinTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class collection2 {
    //Iterator 迭代器
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        // 添加元素到集合
        c.add("串串星人");
        c.add("吐槽星人");
        c.add("汪星人");
        Iterator<String> i = c.iterator();
        while (i.hasNext()) { //判断是否有迭代元素
            String s = i.next();//获取迭代出的元素
            System.out.println(s);
        }

    }
}