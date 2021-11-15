package com.spring.ioc.annotation.service;

import com.spring.ioc.annotation.dao.IUerDao;
import com.spring.ioc.annotation.dao.UserConfigDao;
import org.springframework.stereotype.Service;

/**
 * @Description: 用于java config 核心注解演示
 * @author： see
 * @date： 2021-11-15 8:47 下午
 * @Version:
 */
@Service
public class UserConfigService {
    private IUerDao userConfigDao;
    private IUerDao mysqlDao;

    public IUerDao getUserConfigDao() {
        return userConfigDao;
    }

    public void setUserConfigDao(IUerDao userConfigDao) {
        this.userConfigDao = userConfigDao;
    }

    public IUerDao getMysqlDao() {
        return mysqlDao;
    }

    public void setMysqlDao(IUerDao mysqlDao) {
        this.mysqlDao = mysqlDao;
    }


}
