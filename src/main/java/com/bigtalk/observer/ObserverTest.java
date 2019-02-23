package com.bigtalk.observer;

/**
 * Created by Administrator on 2016/5/28 0028.
 */
public class ObserverTest {

    public static void main(String[] args) {
        Subject sub = new MySubject();
        sub.add(new Observer1());
        sub.add(new Observer2());

        sub.operation();
    }

}
