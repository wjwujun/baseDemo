package com.thread;


/*
* 创建一个Thread的子类
* */
public class myThread extends  Thread{

    @Override
    public void run() {




        //获取当前线程名称
        /*Thread thread = Thread.currentThread();
        System.out.println(thread);
        String name = thread.getName();
        System.out.println(name);*/



        //获取线程名称
        String name = getName();
        System.out.println(name);


        /*for (int i = 0; i < 20; i++) {

            System.out.println("------------run:"+i);
        }*/
    }
}
