package com.rong.method.CollectinTest;

import com.rong.method.ThrowTest.NoScoreException;

import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private String sex;
    private int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        if(score<0){
            throw  new NoScoreException("分数不能为负数"+score);}
        this.score = score;
    }

    Student(String name, int age, String sex){
            this.age=age;
            this.name=name;
            this.sex=sex;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name) &&
                Objects.equals(sex, student.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, sex);
    }
}
