package com.rong.method.BasicTest.Day10;


/**

 * 创建Brush类对象b1,价格赋值为5.8,颜色赋值为红色；
 * 创建Pencil类对象p1,价格赋值为2.5,颜色赋值为黑色；
 * 创建Painter对象,姓名赋值为王流秋；调用两次Painter的draw方法
 * 分别传入b1和p1；进行测试；
 */
public class Test {
    public static void main(String[] args) {
        Brush b1=new Brush(5.8f,"红");
        Pencil p1=new Pencil(2.5f,"黑");
        Painter p=new Painter("王流秋");
        p.draw(b1);
        p.draw(p1);
    }
}
