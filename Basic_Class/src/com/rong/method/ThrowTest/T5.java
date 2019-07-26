package com.rong.method.ThrowTest;

import java.util.Collection;
import java.util.LinkedList;
public class T5 {
    /**
     * 请使用代码实现
     * 每一个学生(Student)都有学号,姓名和分数,分数永远不能为负数
     * 如果老师给学生赋值一个负数,抛出一个自定异常
     *
     */
    public static void main(String[] args) throws NoScoreException {
        try {
            Collection<Students> c=new LinkedList<>();
            c.add(new Students("图图",18,99));
            c.add(new Students("瓜瓜",19,-1));
            System.out.println(c);
        }catch (NoScoreException e){
            e.printStackTrace();
        }

    }
}
