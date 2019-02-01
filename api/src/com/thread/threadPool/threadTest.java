package com.thread.threadPool;



import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
    线程池 JDK1.5以后提供
*
*   java.util.concurrent.Executors;
*
*使用步骤
*   1.使用线程池的工厂Executors里面提供的静态方法newFixedThreadPool生成一个指定线程数量的的线程池
*   2、创建一个类，实现runnable接口，重写run方法，设置线程任务
*   3、调用excetorService中的submit方法，传递线程任务（实现类），开启线程，执行run方法
*   4、调用excetorService中的方法shutdown销毁线程池（不建议使用）
*
*
* */
public class threadTest {

    public static void main(String[] args) {
        //创建线程池
        ExecutorService es = Executors.newFixedThreadPool(3);
        es.submit(new runnable());
        es.submit(new runnable());
        es.submit(new runnable());

        es.shutdown(); //销毁线程池<不建议使用>

    }
}
