package com.spring.ioc.annotation.controller;

import com.spring.ioc.annotation.service.TestUserService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * @Description: spring test 和 junit整合演示
 * @author： see
 * @date： 2021-11-15 9:54 下午
 * @Version:
 */
@Controller
public class TestUserController {
    @Resource
    private TestUserService testUserService;

    public void addInfo() {
        testUserService.add();
    }

    public TestUserService getTestUserService() {
        return testUserService;
    }

    public void setTestUserService(TestUserService testUserService) {
        this.testUserService = testUserService;
    }
}
