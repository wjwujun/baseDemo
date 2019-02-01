package com.thread;



public class threadTest{

    /*
    *
    * 线程名称：main
    * 新线程名称：Thread-0
    *
    * */
    public static void main(String[] args) {

        demo4();


        //主线程会继续执行照主方法中的代码
        /*for (int i = 0; i < 20; i++) {
            System.out.println("main:"+i);
        }*/
        //链式变成，获取当前执行线程名称
        //System.out.println(Thread.currentThread().getName());

    }


    //匿名内部类实现线程创建
    private static void demo4() {

            new Thread(){
                //重写run

                @Override
                public void run() {
                    for (int i = 0; i < 20; i++) {
                        System.out.println(Thread.currentThread().getName());
                    }
                }
            }.start();

        //线程的接口Runnable
        Runnable r=new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+"-------------");
                }
            }
        };
        new Thread(r).start();
    }

    /*
    * Runnable
    *  Thread和Runnable的区别
    *  1、避免了单继承的局限性
    *       一个类只能继承一个类(一个类只能有一个爹)，继承了Thread就不能继承其他类
    *       实现Runnable接口，可以继承其他类，实现其他接口
    *  2、增强了程序的扩展性，降低耦合
    *       实现Runnable接口的方式，把设置线程任务和开启新线程进行了分离
    *       实现类中重写了run方法：用来设置线程任务
    *
    * */
    private static void demo3() {
        //创建一个Runnable接口的实现类
        runnable run = new runnable();
        //创建Thread类对象，构造方法中传递Runnable接口的实现类对象
        Thread t = new Thread(run);
        t.start();

        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"---- main:"+i);
        }


    }

    //sleep
    private static void demo2() {
        myThread2 mt = new myThread2();
        mt.start();
    }

    //thread
    public static void demo1(){
        //创建一个Thread子类对象
        myThread mt = new myThread();
        //调用Thread中的start方法，开启新的线程，执行run方法
        mt.start();
        //设置线程名称
        mt.setName("xiaoqianig");
    }
}
