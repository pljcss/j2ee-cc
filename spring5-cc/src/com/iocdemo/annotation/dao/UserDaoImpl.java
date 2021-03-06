package com.iocdemo.annotation.dao;

import org.springframework.stereotype.Repository;

/**
 * @Author: cs
 * @Date: 2021/1/28 11:47 上午
 * @Desc:
 */
@Repository(value = "userDaoImpl222")
public class UserDaoImpl implements UserDao{

    @Override
    public void add() {
        System.out.println("dao add...");
    }
}
