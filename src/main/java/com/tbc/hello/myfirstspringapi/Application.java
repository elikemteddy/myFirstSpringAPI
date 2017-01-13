package com.tbc.hello.myfirstspringapi;

import java.util.Date;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Theodore Elikem Attigah
 */

@SpringBootApplication
@RestController
public class Application {
    
    @RequestMapping("/hello")
    public String sayHello() {
        return "Hello World!";
    }
    
    @RequestMapping("/")
    public String sayTime() {
        return new Date().toString();
    }
    
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}