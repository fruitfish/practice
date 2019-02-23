package com.asyncdubbo;

import com.alibaba.dubbo.rpc.RpcContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.Future;

public class Consumer {

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "classpath:consumer.xml" });
        context.start();
        // 异步调用示例
        DemoService2 demoService2 = (DemoService2) context.getBean("demoService2");
        Person p = demoService2.getPersion("hanshubo");
        System.out.println(p);
        Future<Person> pFuture = RpcContext.getContext().getFuture();
        p = pFuture.get();
        System.out.println(p);
    }
}