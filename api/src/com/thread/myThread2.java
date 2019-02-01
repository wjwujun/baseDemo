package com.thread;


/*
* 创建一个Thread的子类
* */
public class myThread2 extends  Thread{

    @Override
    public void run() {

        for (int i = 0; i < 20; i++) {
            System.out.println("------------run:"+i);

            //使用sleep方法
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
