package com.fidelity.servicesforangular.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@EnableConfigurationProperties
@PropertySource("classpath:/application.properties")
public class Config {
    @Autowired
    Environment env;

    public String getImagePath() {
        return env.getProperty("roi.imagePath");
    }

}