package com.thread.lambda;


/*
*格式：
*   三部分组成
*   (参数列表)->{一些重写的列表}
*      ():接口中抽象方法的参数列表，没有参数就空着，有就写出参数
*      ->：传递的意思，把参数传给方法体
*      {}：重写接口的抽象方法的方法体
*
* */
public class lambdaTest {

    public static void main(String[] args) {
        runnable run = new runnable();
        Thread thread = new Thread(run);
        thread.start();


        //简写代码
        Runnable r=new Runnable(){

            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };
        new Thread(r).start();

        //匿名内部类
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        }).start();

        //lamdba表达式
        new Thread(()->{
                System.out.println(Thread.currentThread().getName());
        }).start();


    }

}
