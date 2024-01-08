package com.yg.cloud.user.service;

import com.yg.cloud.user.mapper.UserMapper;
import com.yg.cloud.user.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User queryById(Long id) {
        return userMapper.findById(id);
    }
}
