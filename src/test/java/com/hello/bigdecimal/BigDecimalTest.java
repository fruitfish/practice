package com.hello.bigdecimal;

import org.junit.Test;

import java.math.BigDecimal;

/**
 * Created by GanShu on 2017/10/20 0020.
 */
public class BigDecimalTest {

    Double fee;
    @Test
    public void test1 () {
        BigDecimal totalFee = new BigDecimal("0.00");
        totalFee.add(new BigDecimal(fee));
        System.out.println(totalFee.intValue());
    }


}
