package com.test;

import com.spring.ioc.annotation.controller.TestUserController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @Description: 演示spring test 和 junit整合
 * @author： see
 * @date： 2021-11-15 9:59 下午
 * @Version:
 */
@RunWith(SpringJUnit4ClassRunner.class) //将junit4的执行权交给spring,在测试用例执行前自动初始化ioc容器
@ContextConfiguration(locations = {"classpath:annotationApplication.xml"})
public class SpringTest {
    @Resource
    private TestUserController testUserController;

    @Test
    public void testAddInfo() {
        testUserController.addInfo();
    }
}
