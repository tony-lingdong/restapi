package com.restapi.demo.service;

import com.restapi.demo.model.User;
import org.springframework.stereotype.Service;

/**
 * @Author: huld
 * @Date: 2020-04-17 16:13
 */
public interface UserService {
    User getUserById(int id);
    User getUserByUserNameAndPwd(String username,String password);
}
