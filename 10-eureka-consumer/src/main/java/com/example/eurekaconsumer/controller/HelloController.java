package com.example.eurekaconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/client")
public class HelloController {

    @Autowired
    RestTemplate restTemplate;

    /**
     * http端口,不通过注册中心直接调用
     * @return
     */
    @RequestMapping("/hello")
    public Object hello(){
        System.out.println("hello");
        return restTemplate.getForObject("http://localhost:9034/hello", String.class);
    }

    @RequestMapping("/hello2")
    public Object hello2(){
        return restTemplate.getForObject("http://fish-provider/hello", String.class);
    }


}
