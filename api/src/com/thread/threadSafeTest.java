package com.thread;



/*
*
* 线程安全
* */
public class threadSafeTest {

    /*
    *
    * 线程名称：main
    * 新线程名称：Thread-0
    *
    * */
    public static void main(String[] args) {

        demo2();



    }

    //lock
    private static void demo2() {
        runnableSafeLock runn = new runnableSafeLock();
        Thread th1 = new Thread(runn);
        Thread th2 = new Thread(runn);
        Thread th3 = new Thread(runn);
        th1.start();
        th2.start();
        th3.start();

    }

    //synchronized
    public static void demo1(){
        //创建一个Thread子类对象
        runnableSafe mt = new runnableSafe();
        //调用Thread中的start方法，开启新的线程，执行run方法
        Thread th1 = new Thread(mt);
        Thread th2 = new Thread(mt);
        Thread th3 = new Thread(mt);

        th1.start();
        th2.start();
        th3.start();

    }
}
