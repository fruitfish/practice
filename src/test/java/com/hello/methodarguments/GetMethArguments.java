package com.hello.methodarguments;

import org.springframework.core.LocalVariableTableParameterNameDiscoverer;

import java.lang.reflect.Method;

/**
 * Created by GanShu on 2018/6/6 0006.
 */
public class GetMethArguments {


    private static final LocalVariableTableParameterNameDiscoverer parameterNameDiscoverer = new LocalVariableTableParameterNameDiscoverer();
    public void testArguments(String test,Integer myInteger,boolean booleanTest){
    }
    public void test(){

    }
    public static void main(String[] args) {
        Method[] methods = GetMethArguments.class.getMethods();
        for (Method method : methods) {
            String[] paraNames = parameterNameDiscoverer.getParameterNames(method);
            if (paraNames != null) {
                StringBuffer buffer = new StringBuffer();
                for (String string : paraNames) {
                    buffer.append(string).append("\t");
                }
                System.out.println(buffer);
            } else {
                System.out.println("无参数");
            }
        }
    }

}
