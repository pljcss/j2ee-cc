package com.iocdemo.annotationcompletely;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: cs
 * @Date: 2021/1/28 12:31 下午
 * @Desc:
 */
public class SpringTest {

    @Test
    public void test() {
        // 加载配置类
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        UserService2 userService2 = context.getBean("userService2", UserService2.class);

        userService2.add();
    }
}
