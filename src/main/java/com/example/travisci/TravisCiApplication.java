package com.example.travisci;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TravisCiApplication {

    @GetMapping("/say")
    public String hello() {
        return "Travis CI/CD by MinhChan";
    }
    public static void main(String[] args) {
        SpringApplication.run(TravisCiApplication.class, args);
    }

}
