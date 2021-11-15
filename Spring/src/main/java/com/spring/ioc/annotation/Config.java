package com.spring.ioc.annotation;

import com.spring.ioc.annotation.controller.UserController;
import com.spring.ioc.annotation.dao.IUerDao;
import com.spring.ioc.annotation.dao.MysqlDao;
import com.spring.ioc.annotation.dao.UserConfigDao;
import com.spring.ioc.annotation.dao.UserDao;
import com.spring.ioc.annotation.service.UserConfigService;
import com.spring.ioc.annotation.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Description:
 * @author： see
 * @date： 2021-11-15 8:38 下午
 * @Version:
 */
@Configuration   //标注当前类是一个配置类，替代applicationContext.xml文件
@ComponentScan(basePackages = "com.spring.ioc")
public class Config {
    @Bean
    public IUerDao userConfigDao() {
        IUerDao userConfigDao = new UserConfigDao();
        return userConfigDao;
    }

    @Bean
    public IUerDao mysqlDao() {
        IUerDao mysqlDao = new MysqlDao();
        return mysqlDao;
    }

    @Bean   //java config 利用方法创建对象，将方法返回对象放入容器，beanId = 方法名
    //使用参数的方式注入：先尝试按名称注入，然后按类型注入
    public UserConfigService userConfigService(IUerDao userConfigDao,IUerDao mysqlDao) {
        UserConfigService userConfigService = new UserConfigService();
        System.out.println("userConfigService创建完成");
        //2、调用set方法注入值
        userConfigService.setUserConfigDao(userConfigDao);
        userConfigService.setUserConfigDao(mysqlDao);
        System.out.println("调用setUserConfigDao方法");
        return userConfigService;
    }

    @Bean
    public UserController userController(UserConfigService userConfigService) {
        UserController userController = new UserController();
        System.out.println("userController创建完成");
        userController.setUserConfigService(userConfigService);
        System.out.println("调用setUserConfigService方法");
        return userController;
    }
}
