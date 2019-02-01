package com.base.static_;

public class myClass {

    int num;
    static  int numStatic;


    public void method(){
        System.out.println("这是一个成员方法");
        //成员方法可以访问成员变量
        System.out.println(num);
        //成员方法可以访问静态变量
        System.out.println(numStatic);

    }

    public static void methodStatic(){
        System.out.println("静态方法");

        //静态方法可以访问静态变量
        System.out.println(numStatic);

        //静态方法’不‘可以访问静态变量
        //System.out.println(num);
    }



}
