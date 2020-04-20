package cn.chtiucao.dubbo.provider.service.impl;

import cn.chitucao.dubbo.provider.api.IPayService;
import org.apache.dubbo.config.annotation.Service;

@Service
public class PayServiceImpl implements IPayService {

    //执行支付的服务
    @Override
    public String pay(String info) {
        System.out.println("execute pay：" + info);
        return "Hello Dubbo :" + info;
    }
}
