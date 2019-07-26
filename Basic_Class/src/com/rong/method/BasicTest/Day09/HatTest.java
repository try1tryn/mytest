package com.rong.method.BasicTest.Day09;

import java.util.ArrayList;

/**
 * a. 创建FactoryImp对象。
 * b. 调用方法ArrayList<Hat> piliang(int num)，批量生产5个帽子，并接收。
 * c. 遍历接收的集合，调用方法void describe(Hat hat)打印集合中对象的属性。
 */
public class HatTest {
    public static void main(String[] args) {
        FactoryImp fi=new FactoryImp();

      ArrayList<Hat> list= fi.piliang(5);
      for(int i=0;i<list.size();i++){
        fi.describe(list.get(i));}
    }
}
