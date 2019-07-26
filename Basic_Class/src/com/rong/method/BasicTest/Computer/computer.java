package com.rong.method.BasicTest.Computer;

public class computer  {
    //笔记本类，包含运行功能、关机功能、使用USB设备功能
   // 笔记本使用usb设备，这时当笔记本对象调用这个功能时，必须给其传递一个符合USB规则的USB设备
    public void run(){
        System.out.println("电脑运行");
    }
    public void shutDowm(){
        System.out.println("电脑关闭");
    }
    public void usbTest(usbT use){
        if(use!=null){
            use.open();
            // 类型转换,调用特有
            if(use instanceof mouse){
                mouse m=new mouse();
                m.click();
            }
            else if(use instanceof keyboard){
                keyboard k=new keyboard();
                k.click();
            }
            use.dowm();
        }

    }
}
