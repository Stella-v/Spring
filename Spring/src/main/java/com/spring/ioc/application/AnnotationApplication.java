package com.spring.ioc.application;

import com.spring.ioc.annotation.service.UserService;
import com.spring.ioc.entity.Company;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description: 练习使用注解
 * @author： see
 * @date： 2021-11-08 10:21 下午
 * @Version:
 */

public class AnnotationApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:annotationApplication.xml");
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService.getUserDao());
//        String[]  names = context.getBeanDefinitionNames();
//        for (String name : names) {
//            System.out.println(name + " : " + context.getBean(name));
//
//        }
    }
}
