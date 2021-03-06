package com.iocdemo.xml.factorybean;

import com.iocdemo.xml.collectiondi.Course;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: cs
 * @Date: 2021/1/27 9:08 下午
 * @Desc:
 */
public class FactoryBeanTest {

    /**
     * 工厂bean
     */
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/iocdemo/xml/factorybean/bean7.xml");
        Course myBean = context.getBean("myBean", Course.class);
        System.out.println(myBean.getCourseName());
    }

}
