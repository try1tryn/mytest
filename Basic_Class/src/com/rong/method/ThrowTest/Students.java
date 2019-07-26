package com.rong.method.ThrowTest;

import java.util.Objects;

public class Students {

        private String name;
        private int age;
        private int score;

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            if(score<0){
                throw  new NoScoreException("分数不能为负数"+score);}
            this.score = score;
        }

        Students(String name, int age, int score){
            this.age=age;
            this.name=name;
            this.score=score;
            if(score<0){
                throw  new NoScoreException("分数不能为负数"+score);}
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

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return age == students.age &&
                score == students.score &&
                Objects.equals(name, students.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, score);
    }
}


