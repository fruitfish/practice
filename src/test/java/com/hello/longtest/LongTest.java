package com.hello.longtest;

import org.junit.Test;

import java.util.Date;

/**
 * Created by GanShu on 2016/8/19 0019.
 */
public class LongTest {


    @Test
    public void longTest() {
        Long l = 10L;
        System.out.println(String.valueOf(l));
        System.out.println(System.currentTimeMillis());
        System.out.println(new Date().getTime());
        System.out.println(String.valueOf(System.currentTimeMillis() / 1000));
    }

    @Test
    public void nullTest() {
        int a = getI();
        System.out.println(a);
    }

    public Integer getI() {
        return null;
    }


}
