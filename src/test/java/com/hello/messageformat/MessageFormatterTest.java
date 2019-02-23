package com.hello.messageformat;


import org.junit.Test;
import org.slf4j.helpers.FormattingTuple;
import org.slf4j.helpers.MessageFormatter;

/**
 * Created by GanShu on 2017/6/13 0013.
 */
public class MessageFormatterTest {

    @Test
    public void formatterTest() {
        Object[] arr;
        arr = test1();
        FormattingTuple f = MessageFormatter.arrayFormat("text", arr);
        System.out.println(f.getMessage());
    }

    private Object[] test1(Object... params) {
        return params;
    }

}


