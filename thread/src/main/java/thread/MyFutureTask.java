package com.qdtx.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * Created by yn on 2018-10-26
 */
public class MyFutureTask {

    public static void main(String[] args) {
        FutureTask task = new FutureTask(new Callable() {
            public String call() throws Exception {
                return "FutureTask call";
            }
        });

        new Thread(task).start();
//        task.cancel(true);
        try {
            System.out.println(task.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}
