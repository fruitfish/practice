package com.shutdownhook;

/**
 * Created by GanShu on 2016/7/30 0030.
 */
public class ShutDownHookTest {

    public static void main(String[] args) {
        Runtime.getRuntime().addShutdownHook(new Thread() {
            public void run() {
                MyJVMShutdownhook();
            }
        });

        try {
            Thread.sleep(100000000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void MyJVMShutdownhook() {
        System.out.println("Hello, this is my shutdown hook function");
    }


}
