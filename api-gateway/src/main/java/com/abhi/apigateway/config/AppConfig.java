package com.abhi.apigateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Intellij.
 * Author: Abhishek Peiris
 * Date: 14/06/2023
 * Time: 14:28
 */
@Configuration
public class AppConfig {

    @Bean
    public RestTemplate template(){
        return new RestTemplate();
    }
}
