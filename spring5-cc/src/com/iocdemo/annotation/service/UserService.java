package com.iocdemo.annotation.service;

import com.iocdemo.annotation.dao.UserDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: cs
 * @Date: 2021/1/28 12:15 上午
 * @Desc: 注解方式创建对象
 *
 * 在注解里面value值可以省略不写，默认值就是首字母小写的类名
 */
//@Component(value = "userService") // 等价于 <bean id="userService" class="com...">
//@Controller
//@Repository
@Service
public class UserService {

    @Value(value = "hello")
    private String name;

    /**
     * 定义Dao类型属性
     * 不需要添加set方法
     * 添加注入属性注解
     */
//    @Autowired
//    @Qualifier(value = "userDaoImpl")
//    private UserDao userDao;


//    @Resource // 根据类型注入
    @Resource(name = "userDaoImpl222") // 根据名称注入
    private UserDao userDao;

    public void add() {
        userDao.add();
        System.out.println("service add()..." + name);
    }
}
