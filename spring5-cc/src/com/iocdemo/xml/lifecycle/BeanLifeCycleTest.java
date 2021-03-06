package com.iocdemo.xml.lifecycle;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: cs
 * @Date: 2021/1/27 10:04 下午
 * @Desc:
 */
public class BeanLifeCycleTest {

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/iocdemo/xml/lifecycle/bean1.xml");
        Orders orders = context.getBean("orders", Orders.class);

        System.out.println("第四步 获取创建bean实例对象");
        System.out.println(orders.getProduct());

        // 手动让bean实例销毁
        ((ClassPathXmlApplicationContext) context).close();
    }
}
