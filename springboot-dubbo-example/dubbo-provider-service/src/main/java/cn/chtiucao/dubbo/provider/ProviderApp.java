package cn.chtiucao.dubbo.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 */
@SpringBootApplication
public class ProviderApp {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApp.class, args);
//        Main.main(new String[]{"spring", "log4j"}); //Dubbo提供的启动类方法，它会启动dobbu中配置的多个container
//        //除了spring里面通过api的方式去加载springxml文件，还有其他方式？
    }
}
