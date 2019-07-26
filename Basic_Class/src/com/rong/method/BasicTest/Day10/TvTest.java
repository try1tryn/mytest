package com.rong.method.BasicTest.Day10;

public class TvTest {
    public static void main(String[] args) {
        TV tv=new TV("湖南卫视");
        RemoteControl rc=new RemoteControl();
        rc.controlTV(tv);
        Phone p=new Phone();
        p.connecting();
        p.controlTV(tv);

    }
}
