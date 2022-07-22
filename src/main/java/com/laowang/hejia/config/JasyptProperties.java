package com.laowang.hejia.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JasyptProperties {

    @Value("${jasypt.test.url}")
    private String url;

    @Value("${jasypt.test.username}")
    private String username;

    @Value("${jasypt.test.password}")
    private String password;

    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
