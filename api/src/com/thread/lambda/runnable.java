package com.thread.lambda;


/*
*
*
* */
public class runnable  implements  Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
