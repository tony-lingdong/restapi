package com.restapi.demo.controller;

import com.restapi.demo.config.WebSocketServer;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

/**
 * @Author: huld
 * @Date: 2020-05-20 14:58
 */
@Controller
public class WebSocketDemoController {
    @GetMapping("index")
    public ResponseEntity<String> index(){
        return ResponseEntity.ok("请求成功");
    }

    @GetMapping("page")
    public String page(){
        return "websocket.html";
    }

    @RequestMapping("/push/{toUserId}")
    public ResponseEntity<String> pushToWeb(String message, @PathVariable String toUserId) throws IOException {
        WebSocketServer.sendInfo(message,toUserId);
        return ResponseEntity.ok("MSG SEND SUCCESS");
    }
}
