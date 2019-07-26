package com.rong.method.ApiTest;

import java.util.ArrayList;

public class Demo12 {
    /**
     * 将src数组中前3个元素，复制到dest数组的前3个位置上
     * src数组元素[6,7,8,9,10]
     * dest数组元素[1,2,3,9,8]
     */
    public static void main(String[] args) {
        int [] dest={1,2,3,9,8};
        int [] str={6,7,8,9,10};
        System.arraycopy(str,0,dest,0,3);
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<dest.length;i++){
            list.add(dest[i]);

        }
        System.out.println(list);
}

}
