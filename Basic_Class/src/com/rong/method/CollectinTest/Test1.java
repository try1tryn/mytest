package com.rong.method.CollectinTest;

import java.util.LinkedList;

public class Test1 {
    /**
     * 根据要求练习LinkedList方法：
     * （1）基本方法：add, set, get, remove, clear, size等方法；
     */
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.add("图图1号");
        list.add("图图2号");
        list.add("图图3号");
        list.add("图图4号");
        list.add(2,"哈哈");
        System.out.println(list);
        list.set(0,"图图");
        System.out.println(list);
        for(String s:list)
        {
            System.out.println(s);
        }
        System.out.println(list.get(1));
        System.out.println(list.size());
        list.remove(2);
        list.clear();
        System.out.println(list);


    }
}
