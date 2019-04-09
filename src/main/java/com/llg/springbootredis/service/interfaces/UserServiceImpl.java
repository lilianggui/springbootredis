package com.llg.springbootredis.service.interfaces;

import com.llg.springbootredis.entity.User;
import com.llg.springbootredis.mapper.UserMapper;
import com.llg.springbootredis.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: Lange
 * @Date: 2019/4/9 09:19
 * @Description:
 */
@Service
@CacheConfig(cacheNames = "users")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    @CacheEvict(allEntries=true)
    public void insertUser(User user) {
        userMapper.insertUser(user);
    }

    @Override
    @Cacheable
    public List<User> listUser() {
        return userMapper.listUser();
    }

    @Override
    @Cacheable
    public User findUserById(Long userId){
        return userMapper.findUserById(userId);
    }
}
