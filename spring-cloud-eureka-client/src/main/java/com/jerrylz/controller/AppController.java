package com.jerrylz.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jerrylz
 * @date 2020/1/17
 */
@RestController
@RefreshScope
@RequestMapping("/app")
public class AppController {

    @Value("${server.port}")
    private String port;

    @Value("${spring.application.name}")
    private String name;

    @RequestMapping("/sayHi")
    public String sayHi(){
        return String.format("%S的端口号%s", name, port);
    }

}

