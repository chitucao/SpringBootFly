package cn.chitucao.studystarterdemo;

import cn.chitucao.Study;
import cn.chitucao.enabledemo.EnableDemoMain;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author DennyFly
 * @since 2020/3/25 11:54
 */
public class StarterDemoClass {
    public static void main(String[] args) {
        ConfigurableApplicationContext ca= SpringApplication.run(EnableDemoMain.class,args);
        System.out.println(ca.getBean(Study.class).study());
    }
}
