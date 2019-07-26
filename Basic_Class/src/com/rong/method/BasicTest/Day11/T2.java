package com.rong.method.BasicTest.Day11;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class T2 {

    ArrayList<Integer> rnums = new ArrayList<>();
    ArrayList<Integer> unum = new ArrayList<>();
    Random r = new Random();


    public void doubleBall() {
        //双色球
        int bluenums = r.nextInt(16) + 1;
        for(int i=0;i<6;i++){
        int n=r.nextInt(33)+1;
        if(!rnums.contains(n)){
            rnums.add(n);

        }else {
            i--;
        }
        }
        rnums.add(bluenums);
    }

    public void userNum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入红球号码：");
        for (int i = 0; i < 6; i++) {
            unum.add(sc.nextInt());
        }
        System.out.println("请输入蓝球号码：");
        int bluenum = sc.nextInt();
        unum.add(bluenum);

    }

    public void equal() {

        System.out.println("这期开奖号码为："+rnums);
        System.out.println("您购买的号码为："+unum);
        int count = 0;
        for (int i = 0; i < 7; i++) {
            if (unum.get(i).equals(rnums.get(i))) {
                count++;
            }
        }
            if (count == 7) {
                System.out.println("恭喜您，全对，您可以获得1000万的奖金噢");

            } else if (count == 6) {
                System.out.println("恭喜您，对了6个号码，您可以获得500万的奖金噢");
            } else if (count == 5) {
                System.out.println("恭喜您，对了5个号码，您可以获得100万的奖金噢");
            } else if (count == 4) {
                System.out.println("恭喜您，对了4个号码，您可以获得10万的奖金噢");
            } else if (count == 3) {
                System.out.println("恭喜您，对了3个号码，您可以获得500万的奖金噢");
        }
             else {
                System.out.println("你这次没得奖");
            }
    }
}