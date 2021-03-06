package com.aopdemo.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @Author: cs
 * @Date: 2021/1/31 12:44 下午
 * @Desc:
 */
public class JDKProxy {
    public static void main(String[] args) {

        UserDao userDao = (UserDao)Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), new Class[]{UserDao.class}, new UserDaoProxy(new UserDaoImpl()));


        int add = userDao.add(1, 2);
        System.out.println(add);
    }
}

class UserDaoProxy implements InvocationHandler {

    private Object obj;

    public UserDaoProxy(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 方法之前
        System.out.println("方法之前执行..." + method.getName() + "传递的参数" + Arrays.toString(args));

        // 被增强的方法执行
        Object res = method.invoke(obj, args);

        //方法之后
        System.out.println("方法之后执行..." + obj);

        return res;
    }
}