package com.lin.implicitmode.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

/**
 * 授权服务器配置
 * @author j on 2019/5/9
 */
@Configuration
@EnableAuthorizationServer
public class OAuth2AuthorizationServer extends AuthorizationServerConfigurerAdapter{


    @Override
    public void  configure(ClientDetailsServiceConfigurer clientDetailsServiceConfigurer) throws  Exception{
        clientDetailsServiceConfigurer.inMemory()
                .withClient("clinetmode")
                .secret("123456")
                .redirectUris("http://localhost:9001/goback")
                //简化模式
                .authorizedGrantTypes("implicit")
                .accessTokenValiditySeconds(120)
                .scopes("read_userinfo", "read_contacts");

    }

}
