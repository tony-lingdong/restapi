package com.restapi.demo.controller;

import com.restapi.demo.model.AjaxResponse;
import com.restapi.demo.model.User;
import com.restapi.demo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: huld
 * @Date: 2020-04-16 16:51
 */
@RestController
@RequestMapping(value = "/user")
@Api(value = "user-controller",description = "用户信息相关")
public class UserController {
    private final static  Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    UserService userService;
    @ApiOperation(value = "根据id获取用户信息")
    @GetMapping(value = "/get_user_by_id/{id}")
    public AjaxResponse getUserById(@PathVariable int id){
        logger.info("-----------根据用户id返回用户信息-------------");

        User user = userService.getUserById(id);
        logger.info("user对象：[{}]",user);
        return AjaxResponse.success(user);
    }



}
