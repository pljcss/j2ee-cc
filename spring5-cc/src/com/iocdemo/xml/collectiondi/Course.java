package com.iocdemo.xml.collectiondi;

/**
 * @Author: cs
 * @Date: 2021/1/27 6:11 下午
 * @Desc:
 */
public class Course {
    private String courseName;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                '}';
    }
}
