package com.rong.method.BasicTest.Day10;

public class Pen implements WriteAction{
    /**
     *  定义笔类(Pen),实现writeAction接口,重写write()方法，方法内不需要编写内容；
     *     a)    属性: Price 价格（Float),color颜色(String 类型);
     *     b)    提供空参,满参构造方法和set/get方法;
     */
    private  Float price;
    private String color;

    public Pen(){}
    public Pen(Float price, String color) {
        this.price = price;
        this.color = color;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void write() {

    }
}
