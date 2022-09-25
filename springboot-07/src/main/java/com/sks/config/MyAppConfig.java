package com.sks.config;

import com.sks.web.LoginInterceptor;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.Servlet;

@Configuration
public class MyAppConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        String[] paths = {"/user/**"};
        String[] excludedPaths = {"/user/login"};
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns(paths)
                .excludePathPatterns(excludedPaths);
    }
}
