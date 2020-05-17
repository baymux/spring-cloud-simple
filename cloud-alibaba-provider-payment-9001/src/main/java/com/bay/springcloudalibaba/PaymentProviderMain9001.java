package com.bay.springcloudalibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName PaymentProviderMain9001
 * @Description TODO
 * @Author baymux
 * @Date 2020/5/13 18:30
 * @Vsrsion 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentProviderMain9001 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentProviderMain9001.class, args);
    }
}
