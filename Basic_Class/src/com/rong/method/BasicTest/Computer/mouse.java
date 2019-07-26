package com.rong.method.BasicTest.Computer;

public class mouse implements usbT {
    //鼠标类，要实现USB接口，并具备点击的

    @Override
    public void dowm() {
        System.out.println("关闭鼠标");
    }

    @Override
    public void open() {
        System.out.println("打开鼠标");
    }
    public void click(){
        System.out.println("鼠标具有点击的功能");
    }
}
