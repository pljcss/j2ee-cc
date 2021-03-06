package com.iocdemo.xml.autowire;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: cs
 * @Date: 2021/1/27 11:03 下午
 * @Desc:
 */
public class AutoWireBeanTest {

    /**
     * 普通装配
     */
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/iocdemo/xml/autowire/bean.xml");
        Emp emp = context.getBean("emp", Emp.class);

        System.out.println(emp);
    }

    /**
     * 自动装配 byName
     */
    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/iocdemo/xml/autowire/bean.xml");
        Emp emp = context.getBean("emp2", Emp.class);

        System.out.println(emp);
    }
}
