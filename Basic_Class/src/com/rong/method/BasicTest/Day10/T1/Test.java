package com.rong.method.BasicTest.Day10.T1;

public class Test {
    public static void main(String[] args) {
        Teacher teacher=new Teacher("张三丰","武术");
        Student student=new Student("图图",100,teacher);
        teacher.teaching();
        student.getMyResult();

    }
}
