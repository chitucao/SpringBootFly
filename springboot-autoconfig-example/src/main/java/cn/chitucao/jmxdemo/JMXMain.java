package cn.chitucao.jmxdemo;

import javax.management.*;
import java.io.IOException;
import java.lang.management.ManagementFactory;

public class JMXMain {

    public static void main(String[] args) throws MalformedObjectNameException, NotCompliantMBeanException, InstanceAlreadyExistsException, MBeanRegistrationException, IOException {
        MBeanServer beanServer= ManagementFactory.getPlatformMBeanServer();
        ObjectName on=new ObjectName("cn.chitucao.jmxdemo.Mechine:type=mechine");
        MechineMBean mechineMBean =new Mechine();
        beanServer.registerMBean(mechineMBean ,on);
        System.in.read();
    }
}
