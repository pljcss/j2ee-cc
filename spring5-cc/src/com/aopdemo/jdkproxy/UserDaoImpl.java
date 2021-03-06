package com.aopdemo.jdkproxy;

/**
 * @Author: cs
 * @Date: 2021/1/31 12:42 下午
 * @Desc:
 */
public class UserDaoImpl implements UserDao {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public String update(String id) {
        return id;
    }
}
