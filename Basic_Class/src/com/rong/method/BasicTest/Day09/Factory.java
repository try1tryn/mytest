package com.rong.method.BasicTest.Day09;

import java.util.ArrayList;

public interface Factory {
    /**
     *  定义接口 ：Factory（生产帽子类）
     * 抽象方法：void describe(Hat hat)；
     * 抽象方法：ArrayList<Hat> piliang(int num)；
     */
    void describe(Hat hat);
    public abstract ArrayList<Hat> piliang(int num);
}
