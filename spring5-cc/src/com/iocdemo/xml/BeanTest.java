package com.iocdemo.xml;

import com.iocdemo.xml.bean.Emp;
import com.iocdemo.xml.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: cs
 * Date: 2021/1/25 9:18 下午
 * Desc:
 */
public class BeanTest {

    @Test
    public void test() {
        // 1、加载Spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("com/iocdemo/xml/bean1.xml");

        // 2、获取配置创建的对象
        User user = context.getBean("user", User.class);
        User user2 = context.getBean("user", User.class);

        System.out.println(user);
        System.out.println(user2);
        user.sayHi();
    }

    @Test
    public void testBook() {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/iocdemo/xml/bean1.xml");
        Book book = context.getBean("book", Book.class);
        System.out.println(book.getBookName() + book.getBookAuthor() + book.getAddress() + book.getBookType());
    }

    @Test
    public void testBook2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/iocdemo/xml/bean1.xml");
        Book2 book2 = context.getBean("book2", Book2.class);
        System.out.println(book2.getBookName() + book2.getBookAuthor());
    }

    /**
     * 外部bean方式
     */
    @Test
    public void testDao() {
        // 加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("com/iocdemo/xml/bean2.xml");
        // 获取通过配置文件创建的对象
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();

    }

    /**
     * 内部bean方式
     */
    @Test
    public void testDept() {
        // 加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("com/iocdemo/xml/bean3.xml");
        // 获取通过配置文件创建的对象
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp.geteName() + emp.getGender() + emp.getDept());
    }

    /**
     * 级联赋值
     */
    @Test
    public void testDept2() {
        // 加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("com/iocdemo/xml/bean4.xml");
        // 获取通过配置文件创建的对象
        Emp emp = context.getBean("emp2", Emp.class);
        System.out.println(emp.geteName() + emp.getGender() + emp.getDept());
    }


}
