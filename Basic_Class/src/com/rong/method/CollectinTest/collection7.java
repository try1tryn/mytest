package com.rong.method.CollectinTest;

public class collection7 {
    //修饰符 <代表泛型的变量> 返回值类型 方法名(参数){ }
    public <Mvp> void show(Mvp mvp){
        System.out.println(mvp.getClass());
    }
    public <Mvp> Mvp show2(Mvp mvp){
        System.out.println(mvp);
        return mvp;
    }
}
