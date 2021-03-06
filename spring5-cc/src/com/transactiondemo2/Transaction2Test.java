package com.transactiondemo2;


import com.transactiondemo2.service.UserService;
import com.transactiondemo2.txconfig.TxConfig;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: cs
 * @Date: 2021/2/3 11:01 上午
 * @Desc:
 */
public class Transaction2Test {

    @Autowired
    private UserService userService;

    @Test
    public void test() {
        ApplicationContext context = new AnnotationConfigApplicationContext(TxConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.transferMoney();

    }
}
