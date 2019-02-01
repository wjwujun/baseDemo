package com.base.random;


import java.util.Random;

/*
* 随机数
* */
public class randomTest
{
    public static void main(String[] args) {


        Random random = new Random();

        //获取一个随机的int数字,范围是所有int范围，包括正数和负数
        int num = random.nextInt();
        System.out.println(num);
        System.out.println("---------------------------");

        //获取指定范围内的随机数
        int nu = random.nextInt(10); //左闭右开[0,10),所以不会出现10
        System.out.println(nu);


    }

}
