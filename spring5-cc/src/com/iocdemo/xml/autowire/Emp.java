package com.iocdemo.xml.autowire;

/**
 * @Author: cs
 * @Date: 2021/1/27 10:58 下午
 * @Desc:
 */
public class Emp {
    private Dept dept;

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "dept=" + dept +
                '}';
    }
}
