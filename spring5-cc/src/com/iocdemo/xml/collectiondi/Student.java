package com.iocdemo.xml.collectiondi;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @Author: cs
 * @Date: 2021/1/27 5:51 下午
 * @Desc:
 */
public class Student {

    /**
     * 数组类型属性
     */
    private String[] courses;

    /**
     * List集合
     */
    private List<String> list;

    /**
     * Map集合
     */
    private Map<String, String> map;

    /**
     * Set集合
     */
    private Set<String> set;

    /**
     * List集合, 存放对象类型
     */
    private List<Course> courseList;

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }
}
