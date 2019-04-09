package com.llg.springbootredis.controller;

import com.llg.springbootredis.entity.User;
import com.llg.springbootredis.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Auther: Lange
 * @Date: 2019/4/9 09:20
 * @Description:
 */

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("insertUser")
    public String insertUser(User user){
        userService.insertUser(user);
        return "成功";
    }

    @RequestMapping("listUser")
    public List<User> listUser(){
        return userService.listUser();
    }
    @RequestMapping("findUserById")
    public User findUserById(@RequestParam Long userId){
        return userService.findUserById(userId);
    }
}
