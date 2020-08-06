package com.zyj.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author zyj
 * @Date 2020-08-05 9:54
 * @Version 1.0
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced // 实现负载均衡
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
