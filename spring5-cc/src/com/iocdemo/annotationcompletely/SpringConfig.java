package com.iocdemo.annotationcompletely;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: cs
 * @Date: 2021/1/28 12:28 下午
 * @Desc: 完全注解开发，不需要使用bean.xml了
 *        @Configuration：作为配置类，替代xml配置文件
 *        @ComponentScan：
 *
 */
@Configuration
@ComponentScan(basePackages = {"com.iocdemo.annotationcompletely"})
public class SpringConfig {
}
