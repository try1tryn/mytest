package com.rong.method.ThrowTest;

import com.rong.method.ThrowTest.NoScoreException;

public class People {
    //在一款角色扮演游戏中,每一个人都会有名字和生命值;
    private String name;
    private int lifeValue;

    public People(){}

    public People(String name,int lifeValue){
        this.lifeValue=lifeValue;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLifeValue() {
        return lifeValue;
    }

    public void setLifeValue(int lifeValue) {
        if(lifeValue<0)
            throw new NoScoreException("生命值不能为空！");
        this.lifeValue = lifeValue;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", lifeValue=" + lifeValue +
                '}';
    }
}
