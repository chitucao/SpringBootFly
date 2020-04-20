package mydlq.club.example.controller;

import lombok.extern.slf4j.Slf4j;
import mydlq.club.example.util.RedisLocker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author DennyFly
 * @since 2020/3/4 17:37
 */
@Slf4j
@RestController
public class RedisLockerController {

    private static int corePoolSize = Runtime.getRuntime().availableProcessors();

    //创建线程池  调整队列数 拒绝服务
    private static ThreadPoolExecutor executor
            = new ThreadPoolExecutor(corePoolSize, corePoolSize + 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue<>(1000));

    @Autowired
    private RedisLocker redisLocker;


    @GetMapping("/getSingleLock")
    public String testGetSingleLock() {
        if (redisLocker.getLock("xixi", 5, TimeUnit.SECONDS)) {
            log.info("第{}个线程获取到锁", Thread.currentThread().getName());
            return "success";
        }
        return "fail";
    }


    @GetMapping("/batchGetLock")
    public String testGetLocker() {
        final CountDownLatch latch = new CountDownLatch(100);
        for (int i = 0; i < 10; i++) {
            final int n = i;
            Runnable task = () -> {
                while (true) {
                    if (redisLocker.getLock("jack", 2, TimeUnit.SECONDS)) {
                        log.info("第{}个线程获取到锁", n);
                        latch.countDown();
                        break;
                    }
                }
            };
            executor.execute(task);
        }
        try {
            latch.await();
            log.info("所有的线程都获取到了");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "success";
    }

}
