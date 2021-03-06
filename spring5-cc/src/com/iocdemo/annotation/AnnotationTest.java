package com.iocdemo.annotation;

import com.iocdemo.annotation.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: cs
 * @Date: 2021/1/28 12:20 上午
 * @Desc:
 */
public class AnnotationTest {

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/iocdemo/annotation/bean.xml");
        UserService userService = context.getBean("userService", UserService.class);

        System.out.println(userService);
        userService.add();
    }
}
