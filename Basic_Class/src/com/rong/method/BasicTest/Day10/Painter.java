package com.rong.method.BasicTest.Day10;

/**
 *     a)    属性: name姓名(String)
 *     b)    对象方法 : 绘画方法(void draw(Pen p)),首先输出“画家XX正在绘画，”，然后调用p对象的write方法
 *     c)    提供空参,满参构造方法;set/get方法
 */
public class Painter {
    private String name;

     public Painter(){}
     public Painter(String name) {
        this.name = name;
    }
    void draw(Pen p){
        System.out.println("画家"+getName()+"正在绘画");
        p.write();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
