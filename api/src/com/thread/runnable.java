package com.thread;


/*
* 实现步骤
*   1、创建一个Runnable接口的实现类
*   2、在实现类中重写Runnable的run方法，设置线程任务
*   3、创建一个Runnable接口的实现类对象
*   4、创建Thread类对象，构造方法中传递Runnable的实现类
*   5、
* */
public class runnable implements   Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"  "+i);
        }
    }
}
