package com.rocketmq;

/**
 * Created by Administrator on 2016/5/19 0019.
 */
import com.alibaba.rocketmq.client.producer.DefaultMQProducer;
import com.alibaba.rocketmq.common.message.Message;

/**
 * Created with IntelliJ IDEA.
 * User:jiandan
 * Date:2016/3/24.
 * Time:17:09.
 */
public class RocketmqProuder {
    public static void main(String[] args) {
        String topic = "cashlog";

        DefaultMQProducer sendProducer = null;

        // producerGroup 的构成： p_{topic}
        String producerGroup = "p_cashlog";

        //
        String namesrvAddr = "10.1.7.53:9876;10.1.7.54:9876";

        try {
            sendProducer = new DefaultMQProducer(producerGroup);
            sendProducer.setNamesrvAddr(namesrvAddr);
            sendProducer.start();
            while (true) {
                Message message = new Message(topic, "Reserve", "sfsdf".getBytes());
                String msgId = sendProducer.send(message).getMsgId();
                System.out.println("msgId----" + msgId);
            }
        } catch (Exception e) {
            System.out.println("sdfsdf");
        } finally {
            sendProducer.shutdown();
        }
        System.out.println("消息发布成功！！！");
    }
}
