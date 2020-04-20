package cn.chitucao.configurationdemo;

//希望这个类被spring 托管

/**
 * <bean name="" class="com.gupaoedu.springboot.springbootfirst.fristDemo.Democlass"/>
 * javaconfig
 * autoconfiguration  (简化我们bean的注入逻辑）
 */
//@Service
public class DemoClass {

    public void say(){
        System.out.println("Say: Hello Mic");
    }
}


