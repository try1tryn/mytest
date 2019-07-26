package com.rong.method.BasicTest.Day09;

public class Hat {
    /**
     * 定义类：Hat（帽子类）
     * 属性：color（int类型）；price（int类型）；type（String类型）
     * 提供空参，满参构造，set、get方法
     */
    private int color;
    private int price;
    private String type;

    public Hat(){}

    public Hat(int color, int price, String type) {
        this.color = color;
        this.price = price;
        this.type = type;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
