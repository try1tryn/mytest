package com.rong.method.CollectinTest;

import java.util.ArrayList;
import java.util.Collection;

public class collection1 {
    public static void main(String[] args) {
        // 创建集合对象
        // 使用多态
        Collection<String> c=new ArrayList<>();
        c.add("张三");
        c.add("李四");
        c.add("王五");
        System.out.println(c);
        // boolean contains(E e) 判断o是否在集合中存在
        System.out.println(c.contains("哈哈"));
        //boolean remove(E e) 删除在集合中的o元素
        System.out.println("删除张三："+c.remove("张三"));
        System.out.println("删除后的结果为："+c);
        // size() 集合中有几个元素
        System.out.println(c.size());
        // Object[] toArray()转换成一个Object数组
        Object[] o=c.toArray();
        for(int i=0;i<o.length;i++){
            System.out.println(o[i]);
        }
        //  void clear() 清空集合
       c.clear();
        // boolean isEmpty() 判断是否为空
        System.out.println(c.isEmpty());

    }
}
