package com.llg.springbootredis.entity;

import java.io.Serializable;

/**
 * @Auther: Lange
 * @Date: 2019/4/9 09:13
 * @Description:
 */
public class User implements Serializable {

    private Long userId;
    private String username;
    private String password;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
