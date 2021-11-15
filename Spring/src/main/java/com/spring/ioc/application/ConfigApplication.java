package com.spring.ioc.application;

import com.spring.ioc.annotation.Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Repository;

/**
 * @Description: java类配置
 * @author： see
 * @date： 2021-11-15 8:42 下午
 * @Version:
 */

public class ConfigApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        System.out.println("----------------------------------");
        String[] ids = context.getBeanDefinitionNames();
        for (String id : ids) {
            System.out.println(id + ":" + context.getBean(id) );
        }
    }
}
