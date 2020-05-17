package com.bay.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName PaymentMain8004
 * @Description TODO
 * @Author baymux
 * @Date 2020/5/8 23:05
 * @Vsrsion 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient // 该注解用与向consul或者zookeeper作为注册中心时注册服务
public class PaymentMain8004 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8004.class, args);
    }
}
