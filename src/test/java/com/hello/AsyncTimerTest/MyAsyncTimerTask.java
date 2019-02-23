package com.hello.AsyncTimerTest;

import java.util.TimerTask;

/**
 * Created by GanShu on 2016/7/16 0016.
 */
public class MyAsyncTimerTask extends TimerTask {

    int taskid;

    public MyAsyncTimerTask(int _taskid) {
        taskid = _taskid;
    }

    public void run() {
//        int nTasks = 50;
//        int tpSize = 100;
//        ThreadPoolExecutor threadpool = new ThreadPoolExecutor(tpSize, tpSize,
//                50000L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>());

        MyTimerExecutorThread exethread = new MyTimerExecutorThread(taskid);
        exethread.start();
    }
}
