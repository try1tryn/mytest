package com.rong.method.MapTest;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class Map4 {
    //LinkedHashMap
    public static void main(String[] args) {
        LinkedHashMap<String,String> link=new LinkedHashMap<>();
        link.put("111","图图");
        link.put("222","小美");
        Set<Map.Entry<String,String>> entrySet=link.entrySet();
        for(Map.Entry<String,String> entry:entrySet){
            String key=entry.getKey();
            String valve=entry.getValue();
            System.out.println(key+"-----"+valve);
        }
    }
}
