package com.rong.method.CollectinTest;

import java.util.HashSet;

public class collection10 {
    //set---HashSet练习
    public static void main(String[] args) {
      HashSet<Student> hs=new HashSet<>();
        hs.add(new Student("郭德纲",45,"男"));
        hs.add(new Student("郭麒麟",20,"男"));
         for(Student s:hs){
            System.out.println(s);
        }

    }
    }

