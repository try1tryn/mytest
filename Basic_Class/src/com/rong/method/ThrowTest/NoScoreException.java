package com.rong.method.ThrowTest;

public class NoScoreException extends RuntimeException {
    public NoScoreException(){}
    public NoScoreException(String massage){
        super(massage);
    }

}
