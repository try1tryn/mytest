package com.rong.method.CollectinTest;

import java.util.LinkedList;

public class collection9 {
    //linkedList 基本操作
    public static void main(String[] args) {
        LinkedList<String> link =new LinkedList<>();
        link.add("小猪佩奇1");
        link.add("小猪佩奇2");
        link.add("小猪佩奇3");
        System.out.println("原集合："+link);
        System.out.println("集合第一个元素："+link.getFirst());
        System.out.println("集合最后一个元素："+link.getLast());
        System.out.println("移除集合最后的元素，其元素为："+link.removeLast());
        System.out.println("移除元素后的集合："+link);
        if(link.isEmpty()){
            System.out.println("集合为空");
        }else System.out.println("集合不为空");
    }
}
