package com.transactiondemo;

import com.transactiondemo.dao.UserDao;
import com.transactiondemo.dao.UserDaoImpl;
import com.transactiondemo.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: cs
 * @Date: 2021/2/3 11:01 上午
 * @Desc:
 */
public class TransactionTest {

    @Autowired
    private UserService userService;

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/transactiondemo/bean.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.transferMoney();

    }
}
