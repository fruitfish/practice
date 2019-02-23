package com.hello.fortest;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

/**
 * Created by GanShu on 2017/3/11 0011.
 */
public class ForTest {

    @Test
    public void forCirculationTest() {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("b");
        list.add("4");

        List<String> list2 = new ArrayList<>();
        list2.add("a");
        list2.add("b");
        list2.add("#");
        list2.add("d");

        List<String> list3 = new ArrayList<>();
        list3.add("@");
        list3.add("$");
        list3.add("b");
        list3.add("&");

        for(String s : list) {
            for(String l : list2) {
                if(l.equals(s)) {
                    for(String k : list3) {
                        if(l.equals(k)) {
                            System.out.println(l);
                            break;
                        }
                    }
                    System.out.println(l);
                    break;
                }
            }
        }


        int count = Stream.of(1, 2, 3)
                .reduce(0, (acc, element) -> acc + element);

        BinaryOperator<Integer> accumulator = (acc, element) -> acc + element;
        int count_ = accumulator.apply(
                accumulator.apply(
                        accumulator.apply(0, 1),
                        2),
                3);

    }

    @Test
    public void Test3() {
        int init = 100;
        int sum = Stream.of(1, 2, 3).reduce(init, (acc, element) -> acc + element);
        System.out.println(sum);
    }


}
