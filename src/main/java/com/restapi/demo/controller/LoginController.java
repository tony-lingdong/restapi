package com.restapi.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: huld
 * @Date: 2020-05-21 11:39
 */
@Controller
public class LoginController {
    @GetMapping("/login")
    public String login(){
        return "page/login/login";
    }
}
