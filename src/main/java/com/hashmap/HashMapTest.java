package com.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

/**
 * Created by GanShu on 2016/7/30 0030.
 */
public class HashMapTest {


    private static final Map<Integer, Integer> map = new HashMap();

    public static void main(String[] args) {
        try {
            for (int i = 0; i < 100000; i++) {
                map.put(i, i);
            }
            new Thread() {
                public void run() {
                    Set<Entry<Integer, Integer>> set = map.entrySet();
                    synchronized (map) {
                        Iterator<Entry<Integer, Integer>> it = set.iterator();
                        while (it.hasNext()) {
                            Entry en = it.next();
                            System.out.println(en.getKey());
                        }
                    }
                }
            }.start();
            for (int i = 0; i < 1000000; i++) {
                map.put(i, i);
            }
        } catch (Throwable e) {
            e.printStackTrace();
        }

    }




}



