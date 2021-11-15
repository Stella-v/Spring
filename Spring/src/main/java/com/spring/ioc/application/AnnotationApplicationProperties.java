package com.spring.ioc.application;

import com.spring.ioc.annotation.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Primary;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

/**
 * @Description: 练习使用注解
 * @author： see
 * @date： 2021-11-08 10:21 下午
 * @Version:
 */
@Repository
public class AnnotationApplicationProperties {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:annotationApplication.xml");

        UserService userService = context.getBean("userService", UserService.class);
//        UserService userService_sql = context.getBean("userService", UserService.class);
//        System.out.println("value = " + userService.getValue());
    }
}
