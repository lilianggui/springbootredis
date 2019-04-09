package com.llg.springbootredis.service.impl;

import com.llg.springbootredis.entity.User;

import java.util.List;

/**
 * @Auther: Lange
 * @Date: 2019/4/9 09:19
 * @Description:
 */
public interface UserService {
    void insertUser(User user);

    List<User> listUser();
    User findUserById(Long userId);
}
