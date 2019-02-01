package com.thread;


/*
* 线程安全
*   同步代码块
*   synchronized (锁对象){
*       可能会出现线程安全的代码（访问了共享数据的代码）
*   }
*   注意：
*       1.通过代码块中的锁对象，可以使用任意的对象
*       2.但是必须保证多个线程使用的锁对象是同一个
*       3、锁对象的作用
*           把同步代码块锁住，只让一个线程在同步代码块中执行
*
*
* */
public class runnableSafe implements   Runnable{
    //定义一个多线程共享的票源
    private static  int ticket=100;

    //创建一个锁对象
    Object obj=new Object();


    @Override
    public void run() {
        while (true){
            /*
            * 同步代码块
            * 效率不高
            * */
            /*

            synchronized (obj){
                if(ticket>0){//判断票是否存在
                    System.out.println(Thread.currentThread().getName()+"卖票 "+ticket);
                    ticket--;
                }
            }*/
            //payticket();
            payticketStatic();
        }
    }


    /*
     * 静态同步方法
     * 锁对象  不能是this,this是创建对象后产生的，静态方法优先于对象
     *  静态方法的的锁对象是本类的class属性
     * */

    public static  synchronized void payticketStatic(){
    //    synchronized (this){  //另一种写法
            if(ticket>0){//判断票是否存在
                System.out.println(Thread.currentThread().getName()+"卖票 "+ticket);
                ticket--;
            }
      //  }
    }



    /*
    *定义一个同步方法
    *
    *
    * */

    public /*synchronized*/ void payticket(){
        synchronized (this){  //另一种写法
            if(ticket>0){//判断票是否存在
                System.out.println(Thread.currentThread().getName()+"卖票 "+ticket);
                ticket--;
            }
        }
    }




}
