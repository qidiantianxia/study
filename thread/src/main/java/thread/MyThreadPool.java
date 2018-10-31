package com.qdtx.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by yn on 2018-10-26
 */
public class MyThreadPool extends Thread {
    private String name;

    public MyThreadPool(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Thread:" + name);
    }


    public  static  void main(String[] args)
    {
        ExecutorService executor= Executors.newFixedThreadPool(1);
        MyThreadPool thread=new MyThreadPool("thread");
        executor.execute(thread);

        Executors.newFixedThreadPool(1);
        Executors.newScheduledThreadPool(1);
        Executors.newCachedThreadPool();
        Executors.newSingleThreadExecutor();
    }
}
