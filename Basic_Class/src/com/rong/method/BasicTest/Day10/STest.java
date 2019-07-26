package com.rong.method.BasicTest.Day10;

public class STest {
    /**
     * 定义测试类Test，在main方法实现以下功能：
     * 创建一个Line对像lintest,为其赋值:就业班为：黑马班，学费为：19980。
     * Student对象stu，使用set方法为其赋值：姓名为张三，成绩为88，所报班级：lintest。
     */
    public static void main(String[] args) {
        Line lintest=new Line(19980,"黑马班");
        Student stu=new Student("张三",88,lintest);
        stu.exam();
        stu.studyLine();
    }
}
