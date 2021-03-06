package com.iocdemo.xml.service;

import com.iocdemo.xml.dao.UserDao;

/**
 * @Author: cs
 * @Date: 2021/1/27 2:46 下午
 * @Desc: 在service里面调用Dao里面的方法
 */
public class UserService {

    // 创建 UserDao类型属性，生成set方法
    private UserDao userDao;
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add() {
        System.out.println("service add....");

        // 在service里面调用Dao里面的方法，传统方式
        userDao.update();
    }
}
