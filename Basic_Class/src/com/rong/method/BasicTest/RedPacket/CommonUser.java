package com.rong.method.BasicTest.RedPacket;

import java.util.ArrayList;
import java.util.Random;

public class CommonUser extends User {
    public CommonUser() {
    }

    public CommonUser(String name, double leftMoney) {
        super(name, leftMoney);
    }

    public void getRedPacket(ArrayList arr){
        if(arr==null){
            System.out.println("群主没钱！！");
            return;
        }
        //获取随机数
        Random r=new Random();
        //获取红包集合中的索引值
        int i=r.nextInt(arr.size());
        //获得红包金额
        Double redmoney=(Double) arr.get(i);
        System.out.println(getName()+"抢了"+redmoney+"块噢");
        //修改现有的金额
        setLeftMoney(getLeftMoney()+redmoney);
        System.out.println(getName()+"现在的余额为："+getLeftMoney());
        //删除以抢红包的索引
        arr.remove(i);
    }
}
