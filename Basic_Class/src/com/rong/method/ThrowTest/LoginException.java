package com.rong.method.ThrowTest;

public class LoginException extends Exception{
      public LoginException(){}
    /**
     * @param massage 表示异常提示
     */
    public LoginException(String massage){
        super(massage);
    }
}
