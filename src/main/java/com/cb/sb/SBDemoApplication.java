package com.cb.sb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class SBDemoApplication {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello world";
    }

    public static void main(String[] args) {
        SpringApplication.run(SBDemoApplication.class,args);
    }

}
