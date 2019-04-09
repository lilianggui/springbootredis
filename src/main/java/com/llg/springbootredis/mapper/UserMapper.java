package com.llg.springbootredis.mapper;

import com.llg.springbootredis.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

/**
 * @Auther: Lange
 * @Date: 2019/4/9 09:15
 * @Description:
 */
@Mapper

public interface UserMapper {
    void insertUser(User user);


    List<User> listUser();

    User findUserById(Long userId);
}
