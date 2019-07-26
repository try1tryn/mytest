package com.rong.method.BasicTest.RedPacket;

import java.util.ArrayList;

public class RedTest {
    public static void main(String[] args) {
        GroupOwner go=new GroupOwner("群主",6000.0);
        CommonUser c1=new CommonUser("哈哈1号",20.0);
        CommonUser c2=new CommonUser("哈哈2号",30.0);
        CommonUser c3=new CommonUser("哈哈3号",50.0);
        ArrayList<Double> list = go.sendRedPacket(200, 3);
        c1.getRedPacket(list);
        c1.show();
        c2.getRedPacket(list);
        c2.show();
        c3.getRedPacket(list);
        c3.show();





    }
}
