package com.rong.method.CollectinTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test5 {
    /**
     * 要求：
     * 1.遍历集合，并将序号与对应人名打印。
     * 2.向该map集合中插入一个编码为5姓名为李晓红的信息
     * 	3.移除该map中的编号为1的信息
     * 	4.将map集合中编号为2的姓名信息修改为"周林"
     */
    public static void main(String[] args) {
            Map<Integer,String> map =new HashMap<>();
               map.put(1,"图图");
               map.put(2,"哈哈");
               map.put(3,"拉拉");
        Set<Map.Entry<Integer,String>> entrySet=map.entrySet();
        for(Map.Entry<Integer,String> entry:entrySet){
            Integer key=entry.getKey();
            String value=entry.getValue();
            System.out.println(key+"--"+value);

        }
        map.put(5,"李依伊");
        map.remove(1);
        map.put(2,"滴滴");
        System.out.println(map);

    }
}
