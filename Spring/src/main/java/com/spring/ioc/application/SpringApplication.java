package com.spring.ioc.application;

import com.spring.ioc.entity.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description:
 * @author： see
 * @date： 2021-10-21 9:29 PM
 * @Version:
 */
public class SpringApplication {
        public static void main(String[] args) {
            //创建Spring IoC容器,并根据配置文件在容器中实例化对象
            ApplicationContext context = new ClassPathXmlApplicationContext("classpath:springApplication.xml");
            Person person = context.getBean("person1", Person.class);
            person.dress();


        }
}
