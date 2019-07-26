package com.rong.method.CollectinTest;

import java.util.ArrayList;

public class ctest3 {

    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        al.add("b");
        al.add("b");
        String s="a";
        boolean b=listTest(al,s);
        boolean b2=listTest(al);
        System.out.println("判断集合里面是否包含"+al+",结果为："+b);
        System.out.println("判断集合是否为空，结果为："+b2);
    }
    //定义一个方法listTest(ArrayList<String> al),
    // 要求使用isEmpty()判断al里面是否有元素。
    public static boolean listTest(ArrayList<String> al){
        if(al.isEmpty())
            return true;
        return false;
    }
    //定义一个方法listTest(ArrayList<String> al, String ss)
    // 要求使用contains()方法判断al集合里面是否包含ss。
    public static boolean listTest(ArrayList<String> al, String ss){

            if(al.contains(ss)){
                return true;
            }
           return false;
    }
}
