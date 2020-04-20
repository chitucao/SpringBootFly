package cn.chitucao.configurationdemo;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationDemo {

    //如果没有加上@Bean注解，只是在代码中用到了DemoClass这个类，并不会发生依赖注入，空指针
    @Bean
    public DemoClass demoClass() {
        return new DemoClass();
    }

}
