package com.rocketmq;

/**
 * Created by Administrator on 2016/5/19 0019.
 */
import com.alibaba.rocketmq.client.consumer.DefaultMQPushConsumer;
import com.alibaba.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import com.alibaba.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import com.alibaba.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import com.alibaba.rocketmq.common.consumer.ConsumeFromWhere;
import com.alibaba.rocketmq.common.message.MessageExt;


import java.io.IOException;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User:jiandan
 * Date:2016/3/10.
 * Time:14:22.
 */
public class RocketmqConsumer {
    public static void main(String[] args) throws Exception {

        // consumerGroup 的组成：c_{topic}_{订阅方业务名}
        DefaultMQPushConsumer consumer = new DefaultMQPushConsumer("c_binlogmsg_cash");
        consumer.setNamesrvAddr("10.1.7.53:9876;10.1.7.54:9876");
        /**
         * 订阅指定topic下tags
         */
        try {
            // Topic 及 Tag 。tag 支持 a || b
            consumer.subscribe("cashlog", "*");
        } catch (Exception e) {
        }
        /**
         * 设置Consumer第一次启动是从队列头部开始消费还是队列尾部开始消费<br>
         * 如果非第一次启动，那么按照上次消费的位置继续消费
         */
        consumer.setConsumeFromWhere(ConsumeFromWhere.CONSUME_FROM_FIRST_OFFSET);
        consumer.registerMessageListener(new MessageListenerConcurrently() {
            /**
             * 默认msgs里只有一条消息，可以通过设置consumeMessageBatchMaxSize参数来批量接收消息
             */
            @Override
            public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> msgs, ConsumeConcurrentlyContext context) {

                MessageExt msg = msgs.get(0);
                msg.getMsgId();

                // hession序列化注释掉
//                try {
//                    Object O = HessianUtil.deserialize(msg.getBody());
//                    System.out.println(O.toString());
//                } catch (IOException e) {
//                    e.printStackTrace();
//                    return null;
//                }
                return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
            }
        });
        consumer.start();
        System.out.println("启动成功");
    }
}
