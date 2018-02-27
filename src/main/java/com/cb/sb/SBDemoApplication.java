package com.cb.sb;

import com.cb.bll.MyBLL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
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
@ComponentScan(value = {"com.cb.sb","com.cb.bll"}) //默认简便main入口，只扫描本包及其子包，可以通过ComponentScan数组形式指定扫描哪些包
public class SBDemoApplication {

    @Autowired
    MyBLL myBLL;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return myBLL.sayHello();
    }

    //main方法是一个方便快速启动的入口，通过此入口可以不用通过部署到tomcat启动，其内部会会自动加载tomcat插件进行启动，项目真正部署到Web容器后可以此入口不再具有作用
    public static void main(String[] args) {
        SpringApplication.run(SBDemoApplication.class,args);
    }

}
