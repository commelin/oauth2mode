package com.lin.authcodemode.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

/**
 * 资源服务
 *
 * @author xuzhicheng on 2019/5/9
 */
public class OAuth2ResourceServer extends ResourceServerConfigurerAdapter{

    @Override
    public void configure(HttpSecurity httpSecurity)throws Exception{
        httpSecurity.authorizeRequests()
                .anyRequest()
                .authenticated()
                .and()
                .requestMatchers()
                .antMatchers("/user/**");

    }
}
