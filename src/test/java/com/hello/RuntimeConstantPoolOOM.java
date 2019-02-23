package com.hello;

/**
 *
 * String intern方法
 *
 * Created by GanShu on 2016/6/25 0025.
 */
public class RuntimeConstantPoolOOM {

    public static void main(String[] args) {


        String str1 = new StringBuilder("计算机").append("软件").toString();
        System.out.println(str1.intern() == str1);

        String str2 = new StringBuilder("ja").append("va").toString();
        String str3 = "java";
        System.out.println(str2.intern() == str2);
        System.out.println(str2.intern() == str3);

    }
}
