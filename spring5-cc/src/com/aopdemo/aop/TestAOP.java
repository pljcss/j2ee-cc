package com.aopdemo.aop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: cs
 * @Date: 2021/2/1 10:47 上午
 * @Desc:
 */
public class TestAOP {

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/aopdemo/aop/bean.xml");
        User user = context.getBean("user", User.class);

        user.add();


    }
}
