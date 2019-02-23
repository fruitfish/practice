package com.bigtalk.observer;

/**
 * Created by Administrator on 2016/5/28 0028.
 */
public class Observer2 implements Observer {

    @Override
    public void update() {
        System.out.println("observer2 has received!");
    }

}
