package com.hello.AsyncTimerTest;

/**
 * Created by GanShu on 2016/7/16 0016.
 */
public class MyTimerExecutorThread extends Thread {

    int taskid;
    public MyTimerExecutorThread(int _taskid) {
        taskid = _taskid;
    }

    public void run() {
        try {
            System.out.println("execute timer task:"
                    + taskid + " at :" + System.currentTimeMillis());
            Thread.sleep(15000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
