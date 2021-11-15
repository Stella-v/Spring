package com.spring.ioc.annotation.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @Description:
 * @author： see
 * @date： 2021-11-15 7:01 上午
 * @Version:
 */

@Repository
public class MysqlDao implements IUerDao{


    public MysqlDao() {
        System.out.println("正在创建mysqlDao : " + this);
    }
}
