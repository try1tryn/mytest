package com.rong.method.CollectinTest;

import java.util.HashMap;
import java.util.LinkedList;

public class Test6 {
    /**
     * 定义一个泛型为String类型的List集合
     * 统计该集合中每个字符（注意，不是字符串）出现的次数
     * 例如：集合中有”abc”、”bcd”两个元素
     * 程序最终输出结果为：“a = 1,b = 2,c = 2,d = 1”
     */
    public static void main(String[] args) {
        LinkedList<String> list =new LinkedList<>();
        list.add("abc");
        list.add("bcd");
        HashMap<Character,Integer> hash = new HashMap<>();
        for (String s:list){
            char[] chars=s.toCharArray();
            for(Character ch:chars){
                Integer num=hash.get(ch);
            if(num==null){
                 hash.put(ch,1);
            }
            else{
                hash.put(ch,num+1);
            }
            }
            }
        System.out.println(hash);

        }

    }

