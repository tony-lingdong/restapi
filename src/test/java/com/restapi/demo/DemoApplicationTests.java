package com.restapi.demo;

import com.restapi.demo.model.User;
import com.restapi.demo.service.RedisTemplateService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    RedisTemplateService redisTemplateService;
    @Test
    void contextLoads() {
        User user = new User(2,"胡凌东","404283567","weixin123","hulingdong",1,"1314520aa");
        redisTemplateService.set("key3",user);

        User us = redisTemplateService.get("key3",User.class);
        System.out.println(us);
    }
}
