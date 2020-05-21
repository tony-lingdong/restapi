package com.restapi.demo.controller;

import com.restapi.demo.model.AjaxResponse;
import com.restapi.demo.model.User;
import com.restapi.demo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @Author: huld
 * @Date: 2020-04-16 16:51
 */
@Controller
@RequestMapping(value = "/user")
@Api(value = "user-controller")
public class UserController {
    private final static  Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    UserService userService;
    @ApiOperation(value = "登录验证")
    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password, HttpServletRequest request){
        User user = userService.getUserByUserNameAndPwd(username,password);
        HttpSession session = request.getSession();
        if (user == null) {
            return "page/login/login";
        } else {
            session.setAttribute("UserName",user.getUsername());
            return "index";
        }
    }
    @ApiOperation(value = "根据id获取用户信息")
    @GetMapping(value = "/get_user_by_id/{id}")
    public AjaxResponse getUserById(@PathVariable int id){
        logger.info("-----------根据用户id返回用户信息-------------");
        User user = userService.getUserById(id);
        logger.info("user对象123：[{}]",user);
        return AjaxResponse.success(user);
    }



}
