package com.example.randomport;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        //设置随机启动端口
        new StartCommand(args);
        SpringApplication.run(Application.class, args);
    }

}

