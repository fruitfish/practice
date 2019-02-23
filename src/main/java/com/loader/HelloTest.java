package com.loader;

/**
 * @ClassName HelloTest
 * @Description
 * @Author GANSHU
 * @Date 2019/1/12 0012
 * @Version 1.0
 */
public class HelloTest {

    private static int i;
    private static int j = 0;
    private static HelloTest c = new HelloTest();

    private HelloTest() {
        i ++;
        j ++;
    }

    public static HelloTest getBean() {
        return c;
    }

    public static void main(String[] args) {
        System.out.println(i);
        System.out.println(j);
    }

}
