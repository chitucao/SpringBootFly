package cn.chitucao.configurationdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//@ComponentScan(basePackages = "cn.chitucao.configurationdemo")
public class ConfigurationMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(ConfigurationDemo.class);

        String[] defNames=applicationContext.getBeanDefinitionNames();
        for(int i=0;i<defNames.length;i++){
            System.out.println(defNames[i]);
        }

    }
}
