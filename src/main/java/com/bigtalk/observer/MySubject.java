package com.bigtalk.observer;

/**
 * Created by Administrator on 2016/5/28 0028.
 */
public class MySubject extends AbstractSubject {

    @Override
    public void operation() {
        System.out.println("update self!");
        notifyObservers();
    }

}