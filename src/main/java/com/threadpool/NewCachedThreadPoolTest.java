package com.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by GanShu on 2017/2/10 0010.
 */
public class NewCachedThreadPoolTest {

    public static void main(String[] args) {
        final ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            final int index = i;
            try {
                Thread.sleep(index * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            cachedThreadPool.execute(new Runnable() {
                public void run() {
                    System.out.println(index + "   thread name: " + Thread.currentThread().getName());
                    boolean isStop = false;
                    if(index%2 == 0) {
                        isStop = true;
                    }
                    while(isStop) {

                    }
                }
            });
        }
    }
}

