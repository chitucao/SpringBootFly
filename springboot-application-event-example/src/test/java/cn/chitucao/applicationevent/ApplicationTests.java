package cn.chitucao.applicationevent;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.concurrent.TimeUnit;

/**
 * @author DennyFly
 * @since 2020/3/20 16:01
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ApplicationTests.class)
@SpringBootApplication
public class ApplicationTests {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationTests.class, args);
    }

    @Test
    public void testEvent() throws InterruptedException {
        UploadEvent event = new UploadEvent(this);
        SpringContextUtil.publishEvent(event);
        System.out.println(Thread.currentThread().getId() + ">>>OK");  //默认是同步的，Listener的事件在前面 OK1 OK2 OK
        TimeUnit.SECONDS.sleep(10);  //防止spring容器提前关闭
    }
}
