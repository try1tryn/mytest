package com.rong.method.BasicTest.Day10.T1;

public class Student {
    /**
     * 定义Student类，包含空参构造，满参构造和以下成员变量
     * 姓名 name（String类型）
     * 分数 score（int 类型）
     * 老师Teacher  teacher
     * 定义方法getMyResult（），无参无返回值，并输出“我是学生XX，我的老师是YY，他教我ZZ学科”
     * XX是学生的姓名，YY是老师的姓名，ZZ是老师所教学科
     * 判断学员分数是否大于等于60分，如果大于等于60分，则输出“继续加油哦”
     * 如果小于60分，则输出"成绩太低了，老师XX让我回去罚写100遍"，xx是老师的姓名
     */
    private String name;
    private int score;
    Teacher teacher;

    public Student(){}
    public Student(String name, int score, Teacher teacher) {
        this.name = name;
        this.score = score;
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void getMyResult(){
        System.out.println("我是学生"+getName()+"，我的老师是"+getTeacher().getName()+"，他教我"+getTeacher().getCourse()+"学科");
        if(getScore()>=60){
            System.out.println(getName()+"的成绩为："+getScore()+",继续加油哦");
        }
        else {
            System.out.println("成绩太低了，"+getTeacher().getName()+"老师让我回去罚写100遍");
        }
    }
}
