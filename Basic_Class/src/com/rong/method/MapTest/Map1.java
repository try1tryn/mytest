package com.rong.method.MapTest;

import java.util.HashMap;
import java.util.Set;

public class Map1 {
    //Map练习--HashMap
    public static void main(String[] args) {
        HashMap<String,String> hash=new HashMap<>();
        //添加元素到集合
        hash.put("黄晓明", "杨颖");
        hash.put("文章", "马伊琍");
        hash.put("邓超", "孙俪");
        System.out.println(hash);
        hash.remove("黄晓明");
        System.out.println(hash);
        System.out.println(hash.get("文章"));
        Set<String> keys=hash.keySet();
        for(String key:keys){
            String value=hash.get(key);
            System.out.println(value);
        }
    }

}
