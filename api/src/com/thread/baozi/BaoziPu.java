package com.thread.baozi;



/*
* 生产者（包子铺）：是一个线程类，可以继承Thread
* 设置线程任务（run）:生产包子
* 对包子的状态进行判断
* true：有包子
*   包子铺调用wait方法进入等待状态
* false：没有袍子
*   包子铺生产包子
*       交替生产两种包子
*   包子生产修改包子的状态为true，唤醒吃货线程，让吃货线程吃包子
*
* 注意：
*   包子铺线程和包子线程关系--》通信（互斥）
*   必须同时保证两个线程只能有一个在执行
*   锁对象必须保证唯一，可以使用包子对象作为锁对象
*
*   包子铺类和吃货类就需要把包子对象作为参数传递
*       1.需要在成员位置创建一个包子变量
*       2、使用代餐构造方法，为这个包子赋值
* */
public class BaoziPu  extends Thread{
    //创建一个包子变量
    private BaoZi bz;

    //带参数构造方法
    public BaoziPu(BaoZi bz) {
        this.bz = bz;
    }

    //设置线程任务(run)：生产包子


    @Override
    public void run() {
        //定义一个变量
        int count=0;
        while (true){  //一直生产包子

            //必须同时保证，等待和唤醒，只能有一个在执行，使用同步技术
            synchronized (bz){
                if (bz.flag==true){  //对包子状态进行判断
                    //包子铺调用wait方法进入等待状态
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                //被唤醒后执行，包子铺生产包子
                //增加一些趣味性，交替生产两种包子
                if(count%2==0){
                    //生产 薄皮三鲜包子
                    bz.pi="薄皮";
                    bz.xian="三鲜";
                }else {
                    //生产 厚皮 牛肉 包子
                    bz.pi="厚皮";
                    bz.xian="牛肉";
                }

                count++;
                System.out.println("包子铺正在生产："+bz.pi+" "+bz.xian);

                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //包子生产后了以后，修改包子状态为true
                bz.flag=true;
                //唤醒等待的吃货线程，让吃货线程吃包子
                bz.notify();
                System.out.println("包子已经成产好了，可以开始吃了");

            }
        }
    }
}



