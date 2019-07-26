package com.rong.method.BasicTest.Computer;

public class keyboard implements usbT {
    @Override
    public void dowm() {
        System.out.println("关闭键盘");
    }

    @Override
    public void open() {
        System.out.println("打开键盘");
    }
    public void click(){
        System.out.println("键盘具有打字的功能");
    }
}
