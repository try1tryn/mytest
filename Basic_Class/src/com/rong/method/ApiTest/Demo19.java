package com.rong.method.ApiTest;

public class Demo19 {
    /**
     * 现有一个字符数组{'i','t','c','a','s','a'}
     * 请使用System类中的arraycopy()方法在控制台输出“itcast”
     * （提示：将[1]号数组元素复制到最后位置并覆盖原有元素。）
     */
    public static void main(String[] args) {
        char[] c1={'i','t','c','a','s','a'};
        System.arraycopy(c1,1,c1,5,1);
        for(int i=0;i<6;i++){
            System.out.print(c1[i]);
        }
    }
}
