package com.chl.bean;

public class MyJava {
    public static void main(String[] args) {
        //测试单例模式
        Phone p1 = Phone.getInstance();
        Phone p2 = Phone.getInstance();
        System.out.println(p1 == p2);
    }
}
