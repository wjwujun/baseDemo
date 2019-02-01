package com.thread.baozi;


import java.util.TreeMap;

/*
* 消费者吃货： 是一个线程类，继承thread
* 设置线程任务：吃包子
* 对包子的状态进行判断
*   false:没有包子
*       吃货调用线程wait进入等待
*    true：有包子
*       吃包子，吃完修改包子状态为false
*       唤醒包子铺生产包子
*
*
* */
public class ChiHuo extends Thread {
    //创建一个包子变量
    private BaoZi bz;

    //带参数构造方法
    public ChiHuo(BaoZi bz) {
        this.bz = bz;
    }


    @Override
    public void run() {

        while (true){
            //必须同时保证，等待和唤醒，只能有一个在执行，使用同步技术
            synchronized (bz){
                //对包子状态判断
                if(bz.flag==false){
                    //吃货调用wait方法进入等待
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                //被唤醒后吃包子
                System.out.println("吃货正在吃包子");

                //吃完包子，修改包子的状态为flase
                bz.flag=false;
                //唤醒包子铺线程，生产包子
                bz.notify();
                System.out.println("吃货吃完包子了 ，包子生产包子");
                System.out.println("-----------------------------------");
            }
        }
    }
}
