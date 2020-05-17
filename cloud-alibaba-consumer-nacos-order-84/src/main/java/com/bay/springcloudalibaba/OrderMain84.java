package com.bay.springcloudalibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName OrderMain84
 * @Description TODO
 * @Author baymux
 * @Date 2020/5/16 13:02
 * @Vsrsion 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class OrderMain84 {

    public static void main(String[] args) {
        SpringApplication.run(OrderMain84.class, args);
    }
}
