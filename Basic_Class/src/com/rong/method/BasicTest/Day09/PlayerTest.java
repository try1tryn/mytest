package com.rong.method.BasicTest.Day09;

public class PlayerTest {
    /**
     * a.定义一个有返回值的LevelUp(Player p)的方法，将传入的玩家等级加上2，攻击力加1000，在控制台输出：
     * 恭喜玩家XXX升级啦！并返回升级后的该玩家对象。（XXX为该玩家的姓名）
     * b.在main方法中创建两个玩家对象，属性分别赋值为：叶修、5、1000，唐柔、3、300；
     * 名字为叶修的玩家对象调用DaGuai方法；
     * 调用LevelUp(Player p)方法，传入玩家姓名为叶修的玩家对象，获取返回值
     * 	将升级后的姓名为叶修的玩家对象和没有升级的姓名为唐柔的玩家对象的所有属性打印在控制台上。
     */
    public Player levelUp(Player p){
        double power=p.getPower()+2000;
        p.setPower(power);
        int level=p.getLevel()+2;
        p.setLevel(level);
        System.out.println("恭喜玩家"+p.getName()+"升级啦");
        System.out.println(p.getName()+"的等级为"+p.getLevel()+",攻击力为："+p.getPower());
        return p;
    }
    public static void main(String[] args) {
          Player p1=new Player("叶修",5,1000);
          Player p2=new Player("唐柔",3,300);
          p1.DaGuai();
          PlayerTest p=new PlayerTest();
          p.levelUp(p1);
    }
}
