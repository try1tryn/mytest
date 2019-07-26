package com.rong.method.CollectinTest;

import java.util.ArrayList;
import java.util.Collection;

public class collection3 {
    //for循环遍历集合
    public static void main(String[] args) {
        Collection<String> c=new ArrayList<>();
        c.add("哈哈");
        c.add("O(∩_∩)O");
        c.add("解析式");
        for(String a:c){
            System.out.println(a);

        }
    }
}
