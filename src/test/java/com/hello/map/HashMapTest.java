package com.hello.map;

import com.alibaba.dubbo.common.json.JSON;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by GanShu on 2016/8/18 0018.
 */
public class HashMapTest {

    @Test
    public void mapTest() throws IOException {
        Map<String, String[]> map = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            String[] arr = {"apple", "pair"};
            map.put(String.valueOf(i), arr);
        }

        System.out.println(JSON.json(map));
        Map<String, Map> map_ = new HashMap<>();
        dealMap(map_);
        System.out.println(map_);
    }


    public void dealMap(Map<String, Map> map) {

        Map<String, Map> map1;
        map = getMap();

//        map.putAll(map1);
        System.out.println(map);


    }

    public Map<String, Map> getMap(){
        Map<String, Map> map = new HashMap<>();

        Map<String, String> map1 = new HashMap<>();
        map1.put("hel", "ehds");
        map.put("hello", map1);
        return map;
    }

    @Test
    public void putAllTest () {
        Map<String, String> map1 = new HashMap<>();
        Map<String, String> map2 = new HashMap<>();
        map1.put("1","1");
        map2.put("1","1");
        map2.putAll(map1);

        List<String> list = new ArrayList<>();
        list.addAll(map1.values());
        list.addAll(map2.values());
        System.out.println(map2);
        System.out.println(list);
    }

    @Test
    public void mapTest2() {

        Map<String, String> map = new HashMap<>();
        map.put("a", "c");
        map.put("a", "d");
        System.out.println(map);

    }

}
