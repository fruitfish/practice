package com.hello.AsyncTimerTest.timetest;

import java.util.Timer;

/**
 * Created by GanShu on 2016/7/16 0016.
 */
public class MainUtilTimer {

    public static void main(String[] args) {
        Timer timer = new Timer();
        int delay = 500;
        MyTimerTask task1 = new MyTimerTask(1);
        MyTimerTask task2 = new MyTimerTask(2);
        MyTimerTask task3 = new MyTimerTask(3);
        timer.schedule(task1, delay);
        timer.schedule(task2, delay);
        timer.schedule(task3, delay);
    }
}
