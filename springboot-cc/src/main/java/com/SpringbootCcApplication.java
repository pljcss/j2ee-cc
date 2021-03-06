package com;

import ch.qos.logback.core.db.DBHelper;
import com.bean.Pet;
import com.bean.User;
import com.config.MyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * SpringBoot启动类
 */
@SpringBootApplication
public class SpringbootCcApplication {

    public static void main(String[] args) {
//        SpringApplication.run(SpringbootCcApplication.class, args);

        // 1、返回我们的IOC容器
        ConfigurableApplicationContext run = SpringApplication.run(SpringbootCcApplication.class, args);
        // 2、查看容器里面的组件
        String[] beanDefinitionNames = run.getBeanDefinitionNames();

        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }

        // 3、从容器中获取组件
        Pet dogPet1 = run.getBean("dogPet", Pet.class);
        Pet dogPet2 = run.getBean("dogPet", Pet.class);
        System.out.println("dogPet1==dogPet2=" + (dogPet1 == dogPet2));

        // 4、获取MyConfig 组件
        MyConfig bean = run.getBean(MyConfig.class);
        // 因为@Configuration(proxyBeanMethods = true)，因此获得的MyConfig bean是代理类型的
        // com.config.MyConfig$$EnhancerBySpringCGLIB$$6a129745@71936a92
        System.out.println(bean);

        // 如果@Configuration(proxyBeanMethods = true)代理对象调用方法。SpringBoot总会检查这个组件是否在容器中有, 保持组件单实例
        // 如果@Configuration(proxyBeanMethods = false),则获取的user1和user2不相等
        User user1 = bean.user01();
        User user2 = bean.user01();

        System.out.println("user1==user2=" + (user1 == user2));


        System.out.println("========测试@Import=========");
        String[] beanNamesForType = run.getBeanNamesForType(User.class);
        for (String s : beanNamesForType) {
            System.out.println(s);
        }
        String[] dBHelper = run.getBeanNamesForType(DBHelper.class);
        for (String s : dBHelper) {
            System.out.println(s);
        }
        System.out.println("========测试@Import=========");

    }

}
