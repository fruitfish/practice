package com.algorithm.intervalmerge;

/**
 * @ClassName Interval
 * @Description
 * @Author GANSHU
 * @Date 2019/2/27 0027
 * @Version 1.0
 */
public class Interval {
    int start;
    int end;

    Interval() {
        start = 0;
        end = 0;
    }

    Interval(int s, int e) {
        start = s;
        end = e;
    }
}
