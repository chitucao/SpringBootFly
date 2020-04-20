package cn.chitucao.applicationevent;

import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * @author DennyFly
 * @since 2020/3/20 15:18
 */
@Async  //监听者这里设置异步
@Component
public class UpEventListener implements ApplicationListener<UploadEvent> {
    @Override
    public void onApplicationEvent(UploadEvent uploadEvent) {
        try {
            System.out.println(Thread.currentThread().getId()+">>>OK1");
            TimeUnit.SECONDS.sleep(1);
            System.out.println(Thread.currentThread().getId()+">>>OK2");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
