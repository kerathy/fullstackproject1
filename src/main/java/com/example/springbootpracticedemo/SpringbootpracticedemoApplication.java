package com.example.springbootpracticedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.*")
public class SpringbootpracticedemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootpracticedemoApplication.class, args);
    }

}
