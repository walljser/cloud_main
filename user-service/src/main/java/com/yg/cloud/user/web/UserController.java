package com.yg.cloud.user.web;

import com.yg.cloud.user.pojo.User;
import com.yg.cloud.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("{userId}")
    public User queryById(@PathVariable("userId") long userId) {
        return userService.queryById(userId);
    }
}
