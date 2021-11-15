package com.spring.ioc.annotation.controller;

import com.spring.ioc.annotation.service.UserConfigService;
import com.spring.ioc.annotation.service.UserService;
import org.springframework.stereotype.Controller;

/**
 * @Description:
 * @author： see
 * @date： 2021-11-09 10:21 下午
 * @Version:
 */
/*用于java config核心注解演示*/
@Controller
public class UserController {
    private UserConfigService userConfigService;

    public UserConfigService getUserConfigService() {
        return userConfigService;
    }

    public void setUserConfigService(UserConfigService userConfigService) {
        this.userConfigService = userConfigService;
    }
}
