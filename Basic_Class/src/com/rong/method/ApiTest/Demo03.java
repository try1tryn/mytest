package com.rong.method.ApiTest;

public class Demo03 {
    //重写toString()方法
    private String name;
    private int age;

    public static void main(String[] args) {
        Demo03 d=new Demo03();
        System.out.println(d.toString());
    }
    @Override
    public String toString() {
        return "Demo03{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
