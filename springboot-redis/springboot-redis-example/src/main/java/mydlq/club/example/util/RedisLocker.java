package mydlq.club.example.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

/**
 * @author DennyFly
 * @since 2020/3/4 17:22
 */
@Component
public class RedisLocker {

    @Autowired
    private RedisTemplate redisTemplate;

    /**
     * 取锁（指定时间过期）
     * 为null时返回true  首次返回nil：true  5分钟内：false  时间周期后：true
     *
     * @param key
     * @param timeout
     * @param timeUnit
     * @return
     */
    public boolean getLock(String key, long timeout, TimeUnit timeUnit) {

        Assert.notNull(key, "key can not be null!");
        Assert.notNull(timeUnit, "timeUnit can not be null!");

        Object val = redisTemplate.opsForValue().getAndSet(key, "1");

        /* 设置过期时间 */
        redisTemplate.expire(key, timeout, timeUnit);

        if (Objects.nonNull(val)) {
            return false;
        }

        return true;
    }
}
