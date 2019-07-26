package com.rong.method.BasicTest.Day10;

public class Man extends People implements Movement{
    /**
     * 继承People（人）类，实现speak方法，在方法内打印“姓名为X的Y人在说着 Z”
     * 其中X为男人的名字，Y为男人的国籍，Z为当前方法的参数
     * 完成满参构造
     * 实现Movement接口，实现exercise方法，在方法内打印：“X正在锻炼中！”
     * 其中，X为男人的名字。
     * 创建成员方法：life()，在方法内依次调用speak(String str)方法和exercise()方法。
     * 其中speak方法的参数自行创建。
     */
    @Override
    public void speak(String str) {
        System.out.println("姓名为"+getName()+"的"+getCountry()+"人在说着"+str);
    }

    @Override
    public void exercise() {
        System.out.println(getName()+"正在锻炼中");
    }
    public void life(){
        speak("怎么可以吃兔兔");
        exercise();
    }
    public Man() {
    }

    public Man(String name, String country) {
        super(name, country);
    }
}
