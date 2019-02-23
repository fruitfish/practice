package com.asyncdubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2016/5/12 0012.
 */
public class StartProducer {

    @SuppressWarnings("resource")
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "producer.xml" });
        context.start();
        while(true){
            System.out.println("start server success..");
            Thread.sleep(300*1000);
        }
    }
}
