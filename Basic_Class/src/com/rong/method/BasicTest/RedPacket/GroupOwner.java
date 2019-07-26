package com.rong.method.BasicTest.RedPacket;

import java.util.ArrayList;

public class GroupOwner extends User {
    public GroupOwner() {
    }

    public GroupOwner(String name, double leftMoney) {
        super(name, leftMoney);
    }

    public ArrayList<Double> sendRedPacket(int money, int redpacketnum){
        System.out.println("群主余额为："+getLeftMoney());
        ArrayList<Double> arr=new ArrayList<>();
        //如果所发金额大于余额
        if(getLeftMoney()<money){
            System.out.println("穷，没这么多钱！！！");
            return arr;
        }
        else {
            money=money*100;
            int permoney=money/redpacketnum;
            int left=money%redpacketnum;
            for (int i = 0; i < redpacketnum - 1; i++) {
                arr.add(permoney/100.0);
            }
            arr.add((permoney+left)/100.0);
            setLeftMoney((getLeftMoney()*100-money)/100.0);
            System.out.println(getName()+"共发了"+(money/100)+"块，"+redpacketnum+"个红包，所剩余额为："+getLeftMoney());
        }

        return arr;
    }
}
