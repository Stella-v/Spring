package com.spring.ioc.annotation.service;

import com.oracle.webservices.internal.api.message.PropertySet;
import com.spring.ioc.annotation.dao.IUerDao;
import com.spring.ioc.annotation.dao.UserDao;
import jdk.nashorn.internal.objects.annotations.Property;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * @Description:
 * @author： see
 * @date： 2021-11-09 10:00 下午
 * @Version:
 */
@Service
public class UserService {
    //获取*.property文件指定key的value
    @Value("${metaData}")
    private String metaData;

    //1、@Autowired在属性上，是通过Java反射机制将private改成public，然后赋值，不调用set方法
//    @Autowired
    //2、@Resource(name = "userDao")设置名称，则按名称在容器中查找userDao,找不到，报错；不设置名称，则先按名称查找，无结果，再按类型查找
//    @Resource(name = "userDao")
    @Resource()
    private IUerDao userDao;
//    @Autowired
//    @Resource(name = "mysqlDao")
    @Resource()
    private IUerDao mysqlDao;

    //容器启动后初始化方法
    @PostConstruct
    public void init(){
        System.out.println("正在初始化userService,testValue = " +  metaData);
    }

    //容器执行完成后销毁方法
    @PreDestroy
    public void destory() {
        System.out.println("正在销毁userService");
    }

    public UserService() {
        System.out.println("正在创建userService : " + this);
    }

    public IUerDao getUserDao() {
        return userDao;
    }


    public IUerDao getMysqlDao() {
        return mysqlDao;
    }

    public void setMysqlDao(IUerDao mysqlDao) {
        System.out.println("正在执行setMysqlDao方法");
        this.mysqlDao = mysqlDao;
    }

    //@Autowired放在set方法前，会按照类型对方法参数进行注入
//    @Autowired
    public void setUserDao(IUerDao userDao) {
        System.out.println("执行setUserDao方法");
        this.userDao = userDao;
    }
}

