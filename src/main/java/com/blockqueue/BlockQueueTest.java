package com.blockqueue;


import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by Administrator on 2016/5/10 0010.
 */
public class BlockQueueTest {

    public static void main(String[] args) throws InterruptedException {

        LinkedBlockingQueue<People> queue = new LinkedBlockingQueue(3);

        People people = new People();
        people.setName("1");
        queue.put(people);

        people = new People();
        people.setName("2");
        queue.put(people);

        people = queue.take();

        System.out.println(people);
    }
}
