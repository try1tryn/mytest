package com.rong.method.ThrowTest;

import java.io.FileNotFoundException;

public class T2 {
    //try--catch
    public static void main(String[] args) {
        try{
           read("a.txt");
        }catch (FileNotFoundException e){
            System.out.println(e);
        }finally {
            System.out.println("不管程序怎样，这里都将会被执行");
        }
        System.out.println("over");
    }
    public static void read(String path) throws FileNotFoundException{
        if(!path.equals("a.txt")){
            throw new FileNotFoundException("文件不存在");
        }
    }
}
