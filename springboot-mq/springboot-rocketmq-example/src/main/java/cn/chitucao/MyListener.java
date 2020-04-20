package cn.chitucao;

import me.jollyfly.rocketmq.starter.annotation.RocketListeners;
import me.jollyfly.rocketmq.starter.annotation.RocketMQListener;

/**
 * @author DennyFly
 * @since 2020/4/10 18:56
 */
@RocketListeners(topic = "MY_TOPIC")
public class MyListener {

    @RocketMQListener(messageClass = String.class, tag = "TAG_1")
    public void method1(String message) {
        System.out.println(message);
    }

    @RocketMQListener(messageClass = Object.class, tag = "TAG_2")
    public void method2(Object message) {
        System.out.println(message.toString());
    }

}
