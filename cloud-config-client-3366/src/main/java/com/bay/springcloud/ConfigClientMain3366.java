package com.bay.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName ConfigClientMain3366
 * @Description TODO
 * @Author baymux
 * @Date 2020/5/13 10:45
 * @Vsrsion 1.0
 **/
@SpringBootApplication
@EnableEurekaClient
public class ConfigClientMain3366 {
    public static void main(String[] args) {

        SpringApplication.run(ConfigClientMain3366.class, args);
    }
}
