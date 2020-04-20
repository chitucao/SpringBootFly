package club.mydlq.valid.service.impl;

import club.mydlq.valid.param.UserParam;
import club.mydlq.valid.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

/**
 * @author DennyFly
 * @since 2020/3/25 18:12
 */
@Slf4j
@Service
public class UserServiceImpl implements UserService {
    @Override
    @Validated
    public void addUser(UserParam userParam) {
        log.info("用户已经成功插入{}", userParam.toString());
    }
}
