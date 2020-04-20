package club.mydlq.valid.service;

import club.mydlq.valid.param.UserParam;

import javax.validation.Valid;

/**
 * @author DennyFly
 * @since 2020/3/25 18:12
 */
public interface UserService {

    void addUser(@Valid UserParam userParam);
}
