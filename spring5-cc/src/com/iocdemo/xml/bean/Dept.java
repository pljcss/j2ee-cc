package com.iocdemo.xml.bean;

import java.util.Objects;

/**
 * @Author: cs
 * @Date: 2021/1/27 4:09 下午
 * @Desc: 部门类
 */
public class Dept {
    private String dName;

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }


    @Override
    public String toString() {
        return "Dept{" +
                "dName='" + dName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dept dept = (Dept) o;
        return Objects.equals(dName, dept.dName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dName);
    }
}
