package com.rong.method.BasicTest.Day10;

public class Line {
    /**
     *  
     * 定义类Line，包含空参构造，满参构造和以下成员变量
     * 就业班emplymentClass（String 型）
     * 学费   money (int 型)
     * 生成所有成员变量set/get方法
     */
    private int money;
    private String emplymentClass;
    public Line(){}

    public Line(int money, String emplymentClass) {
        this.money = money;
        this.emplymentClass = emplymentClass;
    }

    public String getEmplymentClass() {
        return emplymentClass;
    }

    public void setEmplymentClass(String emplymentClass) {
        this.emplymentClass = emplymentClass;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
