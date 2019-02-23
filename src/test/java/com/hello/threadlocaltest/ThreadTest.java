package com.hello.threadlocaltest;

import org.junit.Test;

/**
 * Created by GanShu on 2017/9/21 0021.
 */
public class ThreadTest {

//    private ThreadLocal<String> threadLocal = new ThreadLocal<>();
    @Test
    public void testThreadLocal() {
        Thread t = new Thread() {
            ThreadLocal<String> mStringThreadLocal = new ThreadLocal<>();

            @Override
            public void run() {
                super.run();
                mStringThreadLocal.set("droidyue.com");
                mStringThreadLocal.get();
            }
        };

        t.start();
    }



}
