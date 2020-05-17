package com.bay.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName StreamMain8801
 * @Description TODO
 * @Author baymux
 * @Date 2020/5/13 15:16
 * @Vsrsion 1.0
 **/
@SpringBootApplication
@EnableEurekaClient
public class StreamMain8801 {

    public static void main(String[] args) {
        SpringApplication.run(StreamMain8801.class, args);
    }
}
