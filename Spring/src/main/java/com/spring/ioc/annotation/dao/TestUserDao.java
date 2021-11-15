package com.spring.ioc.annotation.dao;

import org.springframework.stereotype.Repository;

/**
 * @Description: springTest和junit
 * @author： see
 * @date： 2021-11-15 9:51 下午
 * @Version:
 */
@Repository
public class TestUserDao implements IUerDao{
    public void insert() {
        System.out.println("插入一条用户数据");
    }
}
