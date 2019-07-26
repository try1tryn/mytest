package com.rong.method.BasicTest.Exam;

public class Student {
    /**
     *  定义"学生"类,Student,包含以下成员:
     *  成员属性: name (姓名):String类型，chinese(语文):int类型，math(数学):int类型，属性使用private修饰。
     *  生成所有属性的get/set方法，生成构造方法
     * 成员方法：：void show()方法,打印对象所有属性的值以及对象的语文和数学成绩的总和到控制台;
     */
    private String name;
    private int chinese;
    private int math;

    public Student(){}

    public Student(String name, int chinese, int math) {
        this.name = name;
        this.chinese = chinese;
        this.math = math;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }
    void show(){
        System.out.println("学生名为："+name+"---数学成绩为："+math+"--语文成绩为："+chinese);
        System.out.println("学生总成绩为:"+(math+chinese));
    }
}
