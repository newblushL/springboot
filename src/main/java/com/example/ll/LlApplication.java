package com.example.ll;

import com.example.ll.port.StartCommand;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LlApplication {

    public static void main(String[] args) {
        // 启动参数设置，比如自动生成端口
        //new StartCommand(args);
        SpringApplication.run(LlApplication.class, args);
    }

}
