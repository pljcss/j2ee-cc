package com.config;

import ch.qos.logback.core.db.DBHelper;
import com.bean.Car;
import com.bean.Pet;
import com.bean.User;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * 1、配置类里面使用@Bean标注在方法上给容器注册组件，默认也是单实例的
 * 2、配置类本身也是组件
 *
 * 3、proxyBeanMethods: 代理bean的方法
 *      @Configuration的proxyBeanMethods 属性是springboot2之后加入的，默认为flase
 *      Full(proxyBeanMethods = true)、【保证每个@Bean方法被调用多少次返回的组件都是单实例的】
 *      Lite(proxyBeanMethods = false)【每个@Bean方法被调用多少次返回的组件都是新创建的】
 *      组件依赖必须使用Full模式默认。其他默认是否Lite模式
 *
 *      主要用来解决组件依赖问题
 *
 *  4、@Import({User.class, DBHelper.class})
 *      给容器中自动创建出这两个类型的组件、默认组件的名字就是全类名
 *
 * @Desc: 定义配置类，并在配置类中注册bean
 */
@Import({User.class, DBHelper.class})
@Configuration(proxyBeanMethods = true) // 告诉SpringBoot这是一个配置类，等于配置文件
//@EnableConfigurationProperties(Car.class)
public class MyConfig {

    /**
     * 外部无论对配置类中的这个组件注册方法调用多少次获取的都是之前注册容器中的单实例对象
     * @return
     */
    @Bean // 给容器中添加组件。以方法名作为组件的id。返回类型就是组件类型。返回的值，就是组件在容器中的实例
    public User user01() {
        return new User("张三", "80");
    }

    @Bean("dogPet") // 也可以自定义组件id名
    public Pet pet01() {
        return new Pet("dog");
    }
}
