package com.hello.listtest;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by GanShu on 2017/3/9 0009.
 */
public class ListTest {

    @Test
    public void listTest() {
        List<String> ORDER_STATUS_CHANGE_TYPE = Arrays.asList("12","14","15","17","18");
        System.out.println(ORDER_STATUS_CHANGE_TYPE);

        List<String> ORDER_DELIVERY_STATUS_CHANGE_TYPE = Arrays.asList("51","52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70");  // 运单状态变更类型


        List<String> list = ORDER_DELIVERY_STATUS_CHANGE_TYPE.subList(0, 6);
        System.out.println(list);

    }

    @Test
    public void listTest2() {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        for (String item : list) {
            if ("2".equals(item)) {
                list.remove(item);
            }
        }
    }
}
