package com.rong.method.BasicTest.Computer;

public class computerTest {
    public static void main(String[] args) {
        computer com=new computer();
        com.run();
        usbT m=new mouse();
        com.usbTest(m);
        keyboard k=new keyboard();
        com.usbTest(k);
        com.shutDowm();

    }

}
