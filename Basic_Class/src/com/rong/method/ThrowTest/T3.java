package com.rong.method.ThrowTest;

public class T3 {
    //自定义异常
    private static String[] names = {"bill", "hill", "jill"};

    public static void main(String[] args) {
        try {
            checkUserName("aa");
            System.out.println("注册成功");
        }catch (LoginException e){
            e.printStackTrace();
        }

    }
    //判断当前注册账号是否存在
    //因为是编译期异常，又想调用者去处理 所以声明该异常
    public static boolean checkUserName(String uname) throws LoginException{
              for(String name:names){
                  if(name.equals(uname)){
                       throw new LoginException(name+":账户信息已经存在，哥们");
                  }
        }
              return true;
    }
}
