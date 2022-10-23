package com.sky.toolkit.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/***
 @author sky
 @date 2022/10/22
 @version 1.0
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //以下五步是表单登录进行身份认证最简单的登陆环境
//        http.formLogin() //表单登陆 1
//                .and() //2
//                .authorizeRequests() //下面的都是授权的配置 3
//                .anyRequest() //任何请求 4
//                .authenticated(); //访问任何资源都需要身份认证 5
        http.anonymous();


    }
}
