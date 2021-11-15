package com.spring.ioc.annotation.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

/**
 * @Description: 联系注解使用
 * @author： see
 * @date： 2021-11-08 10:19 下午
 * @Version:
 */
//不备注具体的beanId名称，则名称默认为类名小写 beanId = userDao
//备注beanId名称，则为备注的名称 @Repository("userDao") beanId = userDao

@Repository
public class UserDao implements IUerDao{
    public UserDao() {
        System.out.println("正在创建userDao : " + this);
    }
}
