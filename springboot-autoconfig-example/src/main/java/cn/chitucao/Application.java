package cn.chitucao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;

//本地两个加默认的一共三个数据源，需要关闭默认的
@SpringBootApplication(exclude = {
        DataSourceAutoConfiguration.class,
        DataSourceTransactionManagerAutoConfiguration.class
})
public class Application {

    public static void main(String[] args) {
//        ConfigurableApplicationContext ca = SpringApplication.run(Application.class, args);
//
//        String[] beanDefs = ca.getBeanDefinitionNames();
//        for (String str : beanDefs) {
//            System.out.println(str);
//        }
            SpringApplication.run(Application.class, args);
    }

}
