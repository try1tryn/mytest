package com.rong.method.MapTest;

import java.util.HashMap;
import java.util.Set;
//连接Person类，添加元素在集合，遍历输出
public class Map3 {
    public static void main(String[] args) {
        HashMap<Person,String> map=new HashMap<>();
        map.put(new Person("李四",12),"湖南");
        map.put(new Person("王五",15),"广东");
        Set<Person> set=map.keySet();
        for (Person p:set){
            String value=map.get(p);
            System.out.println(value);
        }
    }
}
