package com.example.javastudy.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/*
实现拦截的配置类    https://juejin.cn/post/6975413007715139621
 */
@Configuration
public class LoginConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //注册拦截器
        registry.addInterceptor(new UserLoginInterceptor())
                        .addPathPatterns("/*")//所有路径拦截
                                .excludePathPatterns("/cboy");//过滤不拦截路径，可多个参数
    }
}
