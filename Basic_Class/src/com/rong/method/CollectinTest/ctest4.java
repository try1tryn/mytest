package com.rong.method.CollectinTest;

import java.util.ArrayList;
import java.util.Iterator;

public class ctest4 {
    //定义一个方法listTest(ArrayList<Integer> al, Integer s)
    // 要求返回s在al里面第一次出现的索引，如果s没出现过返回-1。
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(12);
        al.add(45);
        al.add(33);
        al.add(2);
        int i=2;
        int s=listTest(al,i);
        System.out.println(s);
    }
    public static int listTest(ArrayList<Integer> al,Integer i){
        int location=-1;
        for(int j=0;j<al.size();j++){
            if(al.get(j).equals(i)){
                location=j;
            }
        }
        return location;
    }
}
