package com.reg;

import java.util.Objects;

/**
 * Created by GanShu on 2016/8/10 0010.
 */
public class StringReg {

    public static String a = "eleme/<orderid>/pp/ooi";

    public static void main(String[] args) {

        String b = a.replaceFirst("<(.*?)>", "123");
        System.out.println(b);
        String payment = "1";
        System.out.println(Objects.equals(payment, "1"));
    }

}
