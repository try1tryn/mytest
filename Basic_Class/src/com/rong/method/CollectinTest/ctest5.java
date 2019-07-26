package com.rong.method.CollectinTest;

import java.util.ArrayList;
import java.util.Iterator;

public class ctest5 {
    /**
     * 定义一个学生类Student，包含三个属性姓名、年龄、性别
     * 创建三个学生对象存入ArrayList集合中。
     * A：遍历集合遍历输出。
     * B：求出年龄最大的学生，然后将该对象的姓名变为：小猪佩奇。
     */
    public static void main(String[] args) {
        ArrayList<Student> a=new ArrayList<>();
        a.add(new Student("张三",14,"男"));
        a.add(new Student("李四",15,"男"));
        a.add(new Student("王五",12,"男"));
        fun(a);
        change(a);
    }
    public static void change(ArrayList<Student> a){
        int num=0;
        int index=0;
        for(int i=0;i<a.size();i++){
            if(num<a.get(i).getAge()){
                num=a.get(i).getAge();
                index=i;
            }

        }
        System.out.println("集合中年龄最大的是："+num);
        a.get(index).setName("小猪佩奇");
        fun(a);
    }
    public static void fun(ArrayList<Student> a){
        Iterator<Student> i=a.iterator();
        while (i.hasNext()){
            Student s=i.next();
            System.out.println(s);
        }
    }
}
