package com.thread;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
* 线程安全
*   lock
*   lock获取锁
*   unlock释放锁
*
*使用方式
*   1、在成员位置实现一个ReentrantLock对象
*   2、可能会出现安全问题的代码前调用Lock接口的方法，获取锁
*   3、在可能会出现安全问题的代码后调用unLock接口的方法，释放锁
 * */
public class runnableSafeLock implements   Runnable{
    //定义一个多线程共享的票源
    private static  int ticket=100;

    //创建一个锁对象
        Lock l=new ReentrantLock();



    @Override
    public void run() {
        while (true){
            l.lock();       //加锁
                try {  //提高安全性

                    Thread.sleep(100);
                    if(ticket>0){//判断票是否存在
                        System.out.println(Thread.currentThread().getName()+"卖票 "+ticket);
                        ticket--;
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {  //无论是否有异常，都会释放

                    l.unlock(); //释放锁
                }



        }
    }





}
