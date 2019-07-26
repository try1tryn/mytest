package com.rong.method.ApiTest;

import java.util.Objects;

public class Demo04 {
    //重写equals()方法
    private String name="ss";
    private int age=12;

    public static void main(String[] args) {
        Demo04 d=new Demo04();
        System.out.println(d.name.equals("ss"));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Demo04 demo04 = (Demo04) o;
        return age == demo04.age &&
                Objects.equals(name, demo04.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
