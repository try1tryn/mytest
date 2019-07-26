package com.rong.method.CollectinTest;

import java.util.*;

public class collection11 {
    //HashSet---LinkedHashSet 保证有序
    public static void main(String[] args) {
        Set<String>  s=new LinkedHashSet<>();
        /*s.add("小猪");
        s.add("小兔");
        s.add("小狗");*/
        Collections.addAll(s,"小猪","小兔","小狗");
        Iterator<String> i=s.iterator();
        while (i.hasNext()){
            String animal=i.next();
            System.out.println(animal);
        }
    }
}
