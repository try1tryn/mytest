package com.rong.method.CollectinTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
//泛型
public class collection4 {
    public static void main(String[] args) {
        Collection c=new ArrayList();
        c.add("哈哈");
        c.add("O(∩_∩)O");
        c.add(22);
        Iterator i=c.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
