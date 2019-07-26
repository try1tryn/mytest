package com.rong.method.CollectinTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class ctest2 {
    //定义一个方法，
    // 要求此方法把int数组转成存有相同元素的集合(集合里面的元素是Integer)，并返回()
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5};
        Collection<Integer> c=fun(nums);
        System.out.println(c);
    }
    public static Collection<Integer> fun(int[] nums){
        Collection<Integer> c=new ArrayList<>();
        for(Integer num:nums){
            c.add(num);
        }
        return c;
    }
}
