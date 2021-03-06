package com.cc.config;

import com.cc.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author: cs
 * @Date: 2021/2/20 11:34 下午
 * @Desc: 处理静态资源找不到问题
 *        配置拦截器
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    /**
     * 添加静态资源文件，外部可以直接访问地址
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //需要配置1：----------- 需要告知系统，这是要被当成静态文件的！
        //第一个方法设置访问路径前缀，第二个方法设置资源路径
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
        registry.addResourceHandler("/templates/**").addResourceLocations("classpath:/templates/");
    }


    /**
     * 配置拦截器
     * 1、编写一个拦截器实现 HandlerInterceptor 接口
     * 2、拦截器注册到容器中（实现WebMvcConfigurer的addInterceptors）
     * 3、指定拦截规则，如果是拦截所有，静态资源也会被拦截
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/**") // 所有请求都会拦截，包括静态资源
                .excludePathPatterns("/", "/login", "/bower_components/**", "/dist/**", "/plugins/**");
    }
}
