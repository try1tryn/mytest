package com.rong.method.CollectinTest;

import java.util.LinkedList;

public class Test2 {
    /**
     * 已知数组存放一批QQ号码
     * QQ号码最长为11位
     * 最短为5位
     * String[] strs = {"12345","67891","12347809933","98765432102","67891","12347809933"}。
     * 将该数组里面的所有qq号都存放在LinkedList中
     * 将list中重复元素删除，将list中所有元素分别用迭代器和增强for循环打印出来。
     */
    public static void main(String[] args) {
        String[] strs = {"12345","67891","12347809933","98765432102","67891","12347809933"};
        LinkedList<String> list=new LinkedList<>();
        for(int i=0;i<strs.length;i++){
            if(!list.contains(strs[i])){
                list.add(strs[i]);
            }}
            for(String s:list){
                System.out.println(s);
            }
        }
    }

