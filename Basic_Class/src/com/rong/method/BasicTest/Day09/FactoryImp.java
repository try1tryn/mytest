package com.rong.method.BasicTest.Day09;

import java.util.ArrayList;
import java.util.Random;

/**
 * 重写抽象方法void describe(Hat hat)：
 * 方法内判断hat的color值
 * 若为奇数是红色，若为偶数是黄色
 * 并打印该帽子的所有属性（颜色需打印判断后的值：红色或黄色）。
 */
public class FactoryImp implements Factory {
    @Override
    public void describe(Hat hat) {
        if(hat.getColor()%2==0){
            System.out.println("帽子的颜色为黄色,价格为"+hat.getPrice()+",帽子类型为"+hat.getType());
        }
        else {
            System.out.println("帽子的颜色为红色,价格为"+hat.getPrice()+",帽子类型为"+hat.getType());
        }
    }
    /**
     * 重写抽象方法ArrayList<Hat> piliang(int num)：
     * 使用for循环生成num个Hat对象
     * 对象的color属性随机赋值
     * price属性随机生成：范围为20-100（包含20和100），type属性赋值为太阳帽。
     */
    @Override
    public ArrayList<Hat> piliang(int num) {
        ArrayList<Hat> list=new ArrayList<>();
        Random r=new Random();
        int cnum,pricenum;
        for (int i = 0; i <num ; i++) {
            cnum=r.nextInt();
            pricenum=r.nextInt(81)+20;
            Hat hat=new Hat(cnum,pricenum,"太阳帽");
            list.add(hat);
        }
        return list;
    }
}
