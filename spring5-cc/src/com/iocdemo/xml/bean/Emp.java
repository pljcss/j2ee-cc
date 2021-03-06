package com.iocdemo.xml.bean;

/**
 * @Author: cs
 * @Date: 2021/1/27 4:09 下午
 * @Desc: 员工类
 */
public class Emp {

    private String eName;
    private String gender;
    // 员工属于某一个部门
    private Dept dept;

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }
}
