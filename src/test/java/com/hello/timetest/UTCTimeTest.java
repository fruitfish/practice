package com.hello.timetest;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by GanShu on 2017/5/31 0031.
 */
public class UTCTimeTest {


    @Test
    public void timeTest() throws ParseException {
        String s = "2017-05-28T16:00:12";
        SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");//注意格式化的表达式
        Date d = format2.parse(s);
        System.out.println(d.getTime());
    }


}
