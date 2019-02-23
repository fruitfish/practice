package com.asyncdubbo;

/**
 * Created by Administrator on 2016/5/12 0012.
 */
public class DemoService2Impl implements DemoService2 {

    public Person getPersion(String name) {
        Person r = new Person();
        r.setAge(123);
        r.setName(name);
        return r;
    }
}
