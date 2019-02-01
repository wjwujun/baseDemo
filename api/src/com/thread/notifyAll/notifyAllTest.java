package com.thread.notifyAll;




/*
*
* 进入到TimeWaiting有两种方式
*   1、使用sleeep(Long m)，毫秒值结束后进入到Runnable/Blocked状态
*   2、使用wait(Long m),wait方法如果在毫秒值结束以后，还没有被notify唤醒，就会自动醒来,进入到Runnable/Blocked状态
* 唤醒的方法：
*   notify
*   notifyAll
*
* */
public class notifyAllTest {

    public static void main(String[] args) {
        Object obj=new Object();

        //创建一个顾客线程(消费者)
        new Thread() {
            @Override
            public void run() {
                //一直等着买包子
                while (true) {
                    //保证等待和唤醒的线程只能有一个执行，需要使用同步技术
                    synchronized (obj) {
                        System.out.println("顾客2  知老板要包子");
                        //调用wait方法，放弃cpu执行，进入到waitiing（无线等待）
                        try {
                            obj.wait(5000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        //唤醒后执行的代码
                        System.out.println("顾客2  包子已经做好了，可以吃了");
                        System.out.println("-------------------------");

                    }
                }
            }
        }.start();


        //创建一个顾客线程(消费者)
        new Thread() {
            @Override
            public void run() {
                //一直等着买包子
                while (true) {
                    //保证等待和唤醒的线程只能有一个执行，需要使用同步技术
                    synchronized (obj) {
                        System.out.println("顾客1  通知老板要包子");
                        //调用wait方法，放弃cpu执行，进入到waitiing（无线等待）
                        try {
                            obj.wait(5000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        //唤醒后执行的代码
                        System.out.println("顾客1  通包子已经做好了，可以吃了");
                        System.out.println("-------------------------");

                    }
                }
            }
        }.start();


        new Thread() {
            @Override
            public void run() {
                //一直做包子
                while (true) {
                    //花了5秒做包子
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    //保证等待和唤醒的线程只能有一个执行，需要使用同步技术
                    synchronized (obj) {
                        System.out.println("老板包子做好了，告诉顾客，包子可以吃了-------------");
                        //做好包子以后，调用notify唤醒顾客吃包子
                        //obj.notify();  如果有多个等待线程，随机唤醒一个
                        obj.notifyAll();  //唤醒所有线程


                    }
                }
            }
        }.start();

    }
}
