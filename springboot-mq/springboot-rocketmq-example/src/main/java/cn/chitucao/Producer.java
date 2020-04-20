package cn.chitucao;

import com.alibaba.rocketmq.client.exception.MQBrokerException;
import com.alibaba.rocketmq.client.exception.MQClientException;
import com.alibaba.rocketmq.client.producer.DefaultMQProducer;
import com.alibaba.rocketmq.client.producer.SendResult;
import com.alibaba.rocketmq.common.message.Message;
import com.alibaba.rocketmq.remoting.common.RemotingHelper;
import com.alibaba.rocketmq.remoting.exception.RemotingException;
import me.jollyfly.rocketmq.starter.core.producer.MessageProxy;
import me.jollyfly.rocketmq.starter.core.producer.RocketMqProducerTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;

/**
 * @author DennyFly
 * @since 2020/4/10 18:59
 */
@RestController
@RequestMapping("/test")
public class Producer {

    @GetMapping("/send")
    public void test() throws MQClientException, UnsupportedEncodingException, RemotingException, InterruptedException, MQBrokerException {

        RocketMqProducerTemplate rocketMqProducerTemplate = new RocketMqProducerTemplate();


//        //使用ProducerGroup初始化Producer
//        DefaultMQProducer producer = new DefaultMQProducer("group1");
//        // 指定namesrv
//        producer.setNamesrvAddr("10.0.0.101:9876");
//        producer.start();
        for (int i = 0; i < 100; i++) {
            //创建消息
            Message msg = new Message("MY_TOPIC" /* Topic */,
                    "TAG_1" /* Tag */,
                    ("Hello RocketMQ " + i).getBytes(RemotingHelper.DEFAULT_CHARSET) /* Message body */
            );
            //发送消息
//            SendResult sendResult = producer.send(msg);
            rocketMqProducerTemplate.send(new MessageProxy(msg));
            System.out.printf("%s%n", sendResult);
        }
        //关闭Producer
        producer.shutdown();
    }
}
