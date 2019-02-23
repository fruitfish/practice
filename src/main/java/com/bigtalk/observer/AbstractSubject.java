package com.bigtalk.observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by Administrator on 2016/5/28 0028.
 */
public abstract class AbstractSubject implements Subject {

    private Vector<Observer> vector = new Vector<>();
    @Override
    public void add(Observer observer) {
        vector.add(observer);
    }

    @Override
    public void del(Observer observer) {
        vector.remove(observer);
    }

    @Override
    public void notifyObservers() {
        Enumeration<Observer> enumo = vector.elements();
        while(enumo.hasMoreElements()){
            enumo.nextElement().update();
        }
    }
}
