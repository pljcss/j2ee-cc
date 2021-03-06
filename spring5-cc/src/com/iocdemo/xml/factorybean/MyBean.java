package com.iocdemo.xml.factorybean;

import com.iocdemo.xml.collectiondi.Course;
import org.springframework.beans.factory.FactoryBean;

/**
 * @Author: cs
 * @Date: 2021/1/27 9:03 下午
 * @Desc:
 */
public class MyBean implements FactoryBean<Course> {

    /**
     *
     * @return
     * @throws Exception
     */
    @Override
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setCourseName("数学");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
