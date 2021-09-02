package com.example.HelloWorld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(@RequestParam(name="name", defaultValue = "bhavya") String name) {
        return "Hello World RESTful with Spring Boot";
    }
}
