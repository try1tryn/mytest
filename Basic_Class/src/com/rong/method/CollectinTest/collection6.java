package com.rong.method.CollectinTest;
//学习使用泛型类--collection5类的调用
public class collection6 {
    public static void main(String[] args) {
        collection5<String> c=new collection5<>();
        c.setMvp("哈哈哈");
        System.out.println(c.getMvp());
        collection5<Integer> c2=new collection5<>();
        c2.setMvp(12);
        System.out.println(c2.getMvp());
    }
}
