package com.rong.method.BasicTest.CommonTest;

import java.util.Scanner;

public class basicT2 {
    /**
     * 模拟登录:
     * 1.用户名和密码都是admin
     * 2.如果用户输入的用户名和字码都正确, 提示登陆成功
     * 3.如果用户名或者密码错误,提示用户还有几次机会
     * (例如: 用户名或者密码错误, 您还有2次机会)
     */
    public static void main(String[] args) {
         for(int i=0;i<3;i++){
             Scanner input =new Scanner(System.in);
             System.out.println("请输入用户名：");
             String username=input.next();
             System.out.println("请输入密码：");
             String pass=input.next();
             if(username.equals("admin")&&pass.equals("111111")){
                 System.out.println("登陆成功！！！");
             }else if (i==2){
                 System.out.println("今天登陆的机会用完了哦");
             }else {
                 System.out.println("用户名或者密码错误, 您还有"+(2-i)+"次机会");
             }

         }    }
}
