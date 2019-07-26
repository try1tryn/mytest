package com.rong.method.CollectinTest;

import java.util.*;

public class Test4 {
    public static void main(String[] args) {
        LinkedHashMap<String,String> hash=new LinkedHashMap<>();
        hash.put("黄小", "宝贝");
        hash.put("邓超", "孙俪");
        hash.put("李晨", "范冰冰");
        hash.put("大黑牛", "范冰冰");
        Collection<String> c=hash.values();

        for(String s:c){
            System.out.println(s);
        }
      /*  Iterator<String> i=c.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }*/
    }
}
