package com.mybatis.domain;

/**
 * @Author: cs
 * @Date: 2021/2/26 12:35 下午
 * @Desc:
 */
public class Student {
    private String id;
    private String name;
    private String subjectId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public Student(String id, String name, String subjectId) {
        this.id = id;
        this.name = name;
        this.subjectId = subjectId;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", subjectId='" + subjectId + '\'' +
                '}';
    }
}
