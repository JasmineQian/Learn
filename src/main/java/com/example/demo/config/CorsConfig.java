package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class CorsConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                //Methods是允许任何方法
                .allowedMethods("*")
                //Origins是允许任何域名使用
                .allowedOrigins("*")
                //Origins是允许任何头使用
                .allowedHeaders("*");
        super.addCorsMappings(registry);
    }
}
