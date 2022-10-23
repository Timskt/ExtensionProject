package com.sky.toolkit.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/***
 @author 蔡联发
 @date 2022/10/23
 @version 1.0
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
//
//    @Autowired
//    private PaginationInterceptor paginationInterceptor;
//
//    @Autowired
//    private AccessLimitInterceptor accessLimitInterceptor;

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowCredentials(true)
                .allowedHeaders("*")
                .allowedOrigins("*")
                .allowedMethods("*");
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(paginationInterceptor);
//        registry.addInterceptor(accessLimitInterceptor);
    }

}

