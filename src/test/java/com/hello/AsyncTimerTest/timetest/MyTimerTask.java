package com.hello.AsyncTimerTest.timetest;

import java.util.TimerTask;

/**
 * Created by GanShu on 2016/7/16 0016.
 */
public class MyTimerTask extends TimerTask {

    int taskid;

    public MyTimerTask(int _taskid) {
        taskid = _taskid;
    }

    public void run() {
        int sleepTime = 5000;
        try {
            System.out.println("execute timer task:"
                    + taskid + " at :" + System.currentTimeMillis());
            Thread.sleep(sleepTime);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
