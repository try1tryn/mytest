package com.rong.method.Exam.T2;

public class Dog extends Animal implements Sports{
    public Dog(String name) {
        super(name);
    }
    public Dog() {
    }
    @Override
    public void speak(String str) {
        System.out.println(name+"说："+str);
    }

    @Override
    public void swimming() {
        System.out.println(name+"狗刨中！");
    }
    public void goPlay(){
        speak("我去玩了");
        swimming();
    }

}
