package com.rong.method.CollectinTest;

import java.util.ArrayList;
import java.util.Collections;

public class ctest7 {
    /**
     * 按照斗地主的规则，完成洗牌发牌的动作。 具体规则：
     * 使用54张牌打乱顺序,三个玩家参与游戏，三人交替摸牌，每人17张牌，最后三张留作底牌。
     *
     * 准备牌：
     * 牌可以设计为一个ArrayList,每个字符串为一张牌。 每张牌由花色数字两部分组成，我们可以使用花色
     * 集合与数字集合嵌套迭代完成每张牌的组装。 牌由Collections类的shuffle方法进行随机排序。
     * 发牌
     * 将每个人以及底牌设计为ArrayList,将最后3张牌直接存放于底牌，剩余牌通过对3取模依次发牌。
     * 看牌
     * 直接打印每个集合。
     */
    public static void main(String[] args) {
        // 1.创建一个集合用来存储扑克牌
        ArrayList<String> pokers = new ArrayList<>();

        // 2.创建一个集合用来存储花色
        ArrayList<String> colors = new ArrayList<>();

        // 2.1 往花色集合中添加4个花色
        colors.add("♠");
        colors.add("♣");
        colors.add("♥");
        colors.add("♦");

        // 3.创建一个集合用来存储数字牌
        ArrayList<String> numbers = new ArrayList<>();

        // 3.1 往数字集合中存储数字
        // 添加数字
        for (int i = 2;i<=10;i++){
            numbers.add(i+"");
        }
        //  添加字母
        numbers.add("J");
        numbers.add("Q");
        numbers.add("K");
        numbers.add("A");

        // 4.遍历花色集合和数字集合,进行拼接,得到扑克牌,然后存储到存储到扑克牌的集合中
        for (int i = 0;i<colors.size();i++){
            // 取出花色
            String color = colors.get(i);

            for (int j = 0;j < numbers.size();j++){
                // 取出数字
                String number = numbers.get(j);

                // 拼接成扑克牌
                String pai = color+number;

                // 把生成的扑克牌添加到集合中
                pokers.add(pai);
            }
        }

        // 添加大小王
        pokers.add("大☠");
        pokers.add("小☺");
        System.out.println("洗牌前:");
        System.out.println(pokers);
        System.out.println();

        // 洗牌
        Collections.shuffle(pokers);
        System.out.println("洗牌后:");
        System.out.println(pokers);

        // 发牌
        ArrayList<String> play1 = new ArrayList<>();
        ArrayList<String> play2 = new ArrayList<>();
        ArrayList<String> play3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();

        for (int i = 0;i<pokers.size();i++){
            String pai = pokers.get(i);// 取出牌
            if(i >= pokers.size()-3){
                dipai.add(pai);// 添加底牌
            }else if(i%3==0){
                // 玩家1
                play1.add(pai);
            }else if(i%3==1){
                // 玩家2
                play2.add(pai);
            }else{
                // 玩家3
                play3.add(pai);
            }
        }

        System.out.println("令狐冲："+play1);
        System.out.println("田伯光："+play2);
        System.out.println("绿竹翁："+play3);
        System.out.println("底  牌："+dipai);
    }
}