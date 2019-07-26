package com.rong.method.MapTest;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    public void eat(){
        System.out.println("人要吃饭饭");
    }
    public void sleep(){
        System.out.println("人要睡觉");
    }
    public Person(String name,int age){
        this.age=age;
        this.name=name;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
