package com.bay.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName StreamMQMain8803
 * @Description TODO
 * @Author baymux
 * @Date 2020/5/13 16:17
 * @Vsrsion 1.0
 **/
@SpringBootApplication
@EnableEurekaClient
public class StreamMQMain8803 {

    public static void main(String[] args) {
        SpringApplication.run(StreamMQMain8803.class, args);
    }
}
