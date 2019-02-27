package com.algorithm.intervalmerge;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName IntervalMerge
 * @Description
 * @Author GANSHU
 * @Date 2019/2/27 0027
 * @Version 1.0
 */
public class IntervalMerge {

    private class IntervalComparator implements Comparator<Interval> {
        @Override
        public int compare(Interval i1, Interval i2) {
            return i1.start - i2.start;
        }

    }

    public List<Interval> merge(List<Interval> intervals) {
        if (intervals == null || intervals.size() <= 1) {
            return intervals;
        }
        LinkedList<Interval> list = new LinkedList<>();
        Collections.sort(intervals, new IntervalComparator());

        for (Interval interval : intervals) {
            if (list.isEmpty() || list.getLast().end < interval.start) {
                list.add(interval);
            } else {
                list.getLast().end = Math.max(list.getLast().end, interval.end);
            }
        }
        return list;
    }
}
