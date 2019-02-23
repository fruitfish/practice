package com.hello.waittest;

/**
 * Created by GanShu on 2016/9/2 0002.
 */
public class WaitTest {

    public static void  main(String[] args) {
        Object waitObjcet = new Object();
        System.out.println("one");
        try {
            waitObjcet.wait(1000);
            System.out.println("two");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
