package com.rong.method.MapTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Map5 {
    //计算一个字符串中每个字符出现次
    /**
     * 1. 获取一个字符串对象
     * 2. 创建一个Map集合，键代表字符，值代表次数。
     * 3. 遍历字符串得到每个字符。
     * 4. 判断Map中是否有该键。
     * 5. 如果没有，第一次出现，存储次数为1；
     * 如果有，则说明已经出现过，获取到对应的值进行++，再次存储。
     * 6. 打印最终结果
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入一串字符串：");
        String s=input.next();
        HashMap<Character,Integer> hmap=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(!hmap.containsKey(c)){
                hmap.put(c,1);
            }else {
                Integer count = hmap.get(c);
                hmap.put(c,++count);
            }
        }
        System.out.println(hmap);
    }
}
