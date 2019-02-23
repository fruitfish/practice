package com.threadlocal;

/**
 * Created by GanShu on 2016/10/8 0008.
 */
public class ThreadLocalTest {

    private static ThreadLocal<String> stringHolder = new ThreadLocal<String>(){

        @Override
        public String initialValue() {
            return "hello world!";
        }

    };
}
