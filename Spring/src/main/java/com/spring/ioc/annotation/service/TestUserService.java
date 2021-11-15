package com.spring.ioc.annotation.service;

import com.spring.ioc.annotation.dao.IUerDao;
import com.spring.ioc.annotation.dao.TestUserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description: spring Test 和 junit整合演示
 * @author： see
 * @date： 2021-11-15 9:53 下午
 * @Version:
 */
@Service
public class TestUserService {
    @Resource
    private TestUserDao testUserDao;

    public IUerDao getTestUserDao() {
        return testUserDao;
    }

    public void setTestUserDao(TestUserDao testUserDao) {
        this.testUserDao = testUserDao;
    }

    public void add() {
        testUserDao.insert();
    }
}
