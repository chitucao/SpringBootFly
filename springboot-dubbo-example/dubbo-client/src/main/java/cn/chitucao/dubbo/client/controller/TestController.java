package cn.chitucao.dubbo.client.controller;

import cn.chitucao.dubbo.provider.api.IPayService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author DennyFly
 * @since 2020/4/10 10:52
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Reference
    private IPayService payService;

    @GetMapping("/pay/{info}")
    public void testPay(@PathVariable String info) {
        payService.pay(info);
    }
}
