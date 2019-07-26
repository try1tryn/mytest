package com.rong.method.BasicTest.Day09;

public class MobileGame extends Game{
    public MobileGame(String type, String name) {
        super(type, name);
    }

    public MobileGame() {
    }

    /**
     * 定义手游类（MobileGame) 继承 Game，包含空参、满参构造
     *        定义私有方法:void efforts() 要求输出：“晚上不睡觉玩 XXX”
     *        定义私有方法：void damage() 要求输出：“导致白天上课困，毕业后找不到工作”
     *        实现抽象方法：
     *        void play()  输出格式: “名称为XXX的YYY类游戏非常流行。”
     *        定义方法:void prepare(),依次调用efforts(),damage()       
     *        Ps:XXX为变量name的值，YYY为type的值
     */
    private void efforts(){
        System.out.println("晚上不睡觉玩"+getName());
    }
    private void damage(){
        System.out.println("导致白天上课困，毕业后找不到工作");
    }
    @Override
    public void play() {
        System.out.println("名称为"+getName()+"的"+getType()+"类游戏非常流行");
    }
    public void prepare(){
        efforts();
        damage();
    }
}
