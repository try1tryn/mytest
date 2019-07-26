package com.rong.method.BasicTest.Exam;

import java.util.ArrayList;

public class StudentTest {
    /**
     * 定义类：Test,类中定义main()方法，按以下要求编写代码:
     *定义public static ArrayList<Student>  getSum(ArrayList<Student> list){...}方法:
     *要求：遍历list集合
     * 将list中语文成绩和数学成绩的总和大于160分的元素
     * 存入到另一个ArrayList<Student> 中并返回。
     *分别实例化三个Student对象
     * 三个对象分别为："邓超" ,88,99、"baby" ,85,78、"郑凯" ,86,50;
     *创建一个ArrayList集合
     * 这个集合里面存储的是Student类型
     * 分别将上面的三个Student对象添加到集合中
     * 调用方法getSum，根据返回的list集合遍历对象并调用show（）方法输出所有元素信息。
     */
    public static ArrayList<Student> getSum(ArrayList<Student> list){
        ArrayList<Student> newlist=new ArrayList<>();
        for(int i=0;i<list.size();i++){
            if(list.get(i).getMath()+list.get(i).getChinese()>160){
                newlist.add(list.get(i));
            }else continue;
        }
        return newlist;
    }

    public static void main(String[] args) {
        Student s=new Student();
        ArrayList<Student> list=new ArrayList<>();
        list.add(new Student("邓超" ,100,99));
        list.add(new Student("baby" ,85,78));
        list.add(new Student("郑凯" ,86,50));
        ArrayList<Student> newlist=getSum(list);
        for (int i = 0; i < newlist.size(); i++) {
            newlist.get(i).show();
        }


    }
}
