package com.rong.method.BasicTest.Day08;

public class TestT1 {
    /**
     * 编写一个Java程序，提示用户输入一串字符串，要求字符串中必须存在字母（需要代码判断）
     * 1.若不符合要求，则提示用户重新输入直至符合要求为止
     * 2.若符合要求，则判断字符串中大写字母出现次数并打印。
     */
    static boolean result=false;
    public boolean fun1(String s) {

        for (int i = 0; i <s.length() ; i++) {
            if((s.charAt(i)>='A'&&s.charAt(i)<='Z')||(s.charAt(i)>='a'&&s.charAt(i)<='z')){
                System.out.println("该字符串符合要求");
                result=true;
                fun2(s,result);
                break;

            }
            else {
                if(i==s.length()-1){
                    System.out.println("请重新输入！！！");
                    break;
                }
                continue;

            }

        }
        return  result;

    }
    public void fun2(String s,boolean result) {
        if(result==true){
        int count=0;
        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i)>='A'&&s.charAt(i)<='Z'){
                count++;
            }

        }
            System.out.println("字符串中大写字母出现的次数为："+count);

    }

    }


}
