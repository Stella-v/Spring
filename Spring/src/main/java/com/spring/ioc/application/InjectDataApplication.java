package com.spring.ioc.application;

import com.spring.ioc.entity.Company;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description:
 * @author： see
 * @date： 2021-10-24 2:56 PM
 * @Version:
 */
public class InjectDataApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:injectDataApplication.xml");
        Company company = context.getBean("company", Company.class);
        System.out.println(company);
        //查看容器内beanId数组
        String[] names = context.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println("类型：" + context.getBean(name).getClass().getName());
            System.out.println("内容: " + context.getBean(name));

        }
    }
}
