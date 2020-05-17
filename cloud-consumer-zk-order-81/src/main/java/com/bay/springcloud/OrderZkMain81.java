package com.bay.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName OrderZkMain81
 * @Description TODO
 * @Author baymux
 * @Date 2020/5/9 22:02
 * @Vsrsion 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class OrderZkMain81 {
    public static void main(String[] args) {
        SpringApplication.run(OrderZkMain81.class, args);
    }
}
