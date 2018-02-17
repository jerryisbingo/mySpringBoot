package com.cb.sb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/***
 Controller 同SpringMVC一样，是表明该类是一个MVC的Controller类
 SpringBootApplication 注解主要是开启自动配置以及指定java配置类等作用，是一个组合注解
 SpringBootApplication注解中包含SpringBootConfiguration，而SpringBootConfiguration中包含@Configuration，所以可以省略@Configuration注解
 */
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
