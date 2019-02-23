package com.hello.stringtest;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by GanShu on 2016/8/18 0018.
 */
public class StringTest {

    @Test
    public void splitTest() {

        String s1 ="123,456";
        String s2 = "369";
        String[] arr1 = s1.split(",");
        String[] arr2 = s2.split(",");

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        Integer packingFee = null;
        stringTest(packingFee);
        System.out.println(packingFee);
        String arr = "11";
        System.out.println(arr.substring(1, arr.length() - 1));

        String str = "a,b,c,,";
        String[] ary = str.split(",");
        System.out.println(ary);

    }

    public void stringTest(Integer packingFee) {
        packingFee = 10;
    }

    @Test
    public void getSystemProperty() {
        String s = System.getProperty("http.maxConnections", "20");
        System.out.println(s);
        s = System.getProperty("http.maxConnections");
        System.out.println(s);
        s = System.getProperty("http.keepAlive", "true");
        System.out.println(s);

    }

    @Test
    public void arrTest() {

        String[] arr = {"1", "2"};
        List<String> list = Arrays.asList(arr);
        System.out.println(list);
    }

    @Test
    public void strTest() {
        String s = "同意取消订单失败: InvalidEvent()";
        System.out.println(s.split(":")[0]);

        s = "果粒橙[常温+少糖]";
        String itemName = s.split("-")[0];
        System.out.println(itemName.split("\\[")[0]);

    }

}












