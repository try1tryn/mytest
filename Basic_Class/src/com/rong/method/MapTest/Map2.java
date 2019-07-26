package com.rong.method.MapTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map2 {
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<>();
        //添加元素到集合，将键值封装为对象
        map.put("黄晓明", "杨颖");
        map.put("文章", "马伊琍");
        map.put("邓超", "孙俪");
        Set<Map.Entry<String,String>> enteySet=map.entrySet();
        for(Map.Entry<String,String> entry:enteySet){
            String key=entry.getKey();
            String value=entry.getValue();
            System.out.println(key+" "+value);
        }

    }
}
