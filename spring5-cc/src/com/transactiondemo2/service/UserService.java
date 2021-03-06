package com.transactiondemo2.service;

import com.transactiondemo2.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: cs
 * @Date: 2021/2/2 4:03 下午
 * @Desc:
 */
@Service
@Transactional
public class UserService {

    @Autowired
    private UserDao userDao;

    public void transferMoney() {
        // lucy少100
        userDao.reduceMoney();

        // 模拟异常
        int a = 10 / 0;

        // mary多100
        userDao.addMoney();
    }
}
