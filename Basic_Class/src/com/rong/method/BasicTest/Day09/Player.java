package com.rong.method.BasicTest.Day09;

/**
 * 	成员属性：姓名name(String类型)、等级Level(int类型)，攻击力power(double类型)，
 * 	属性用私有修饰。
 * 	生成空参和满参构造、get/set方法。
 * 	重写抽象方法void DaGuai( )：输出格式：XXX正在打怪。（xxx为player的玩家姓名）
 */
public class Player implements Fight{
    private String name;
    private int Level;
    private double power;

    public Player(String name, int level, double power) {
        this.name = name;
        Level = level;
        this.power = power;
    }
    public Player(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return Level;
    }

    public void setLevel(int level) {
        Level = level;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    @Override
    public void DaGuai() {
        System.out.println(name+"正在打怪");
    }
}
