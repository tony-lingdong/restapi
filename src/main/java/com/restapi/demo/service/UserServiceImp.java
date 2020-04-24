package com.restapi.demo.service;

import com.restapi.demo.mapper.UserMapper;
import com.restapi.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: huld
 * @Date: 2020-04-17 16:14
 */
@Service
public class UserServiceImp implements UserService{
    @Autowired(required = false)
    UserMapper userMapper;

    @Override
    public User getUserById(int id) {
        return userMapper.getUserById(id);
    }
}
