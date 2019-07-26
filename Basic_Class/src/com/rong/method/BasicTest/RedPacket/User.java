package com.rong.method.BasicTest.RedPacket;

public class User {
    private String name;
    private double leftMoney;

    public User() {
    }

    public User(String name, double leftMoney) {
        this.name = name;
        this.leftMoney = leftMoney;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLeftMoney() {
        return leftMoney;
    }

    public void setLeftMoney(double leftMoney) {
        this.leftMoney = leftMoney;
    }
    public void show(){
        System.out.println("用户信息为："+name+",账户余额为："+leftMoney);
    }
}
