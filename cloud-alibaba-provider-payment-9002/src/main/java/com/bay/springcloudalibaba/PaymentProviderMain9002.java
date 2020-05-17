package com.bay.springcloudalibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName PaymentProviderMain9002
 * @Description TODO
 * @Author baymux
 * @Date 2020/5/13 18:46
 * @Vsrsion 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentProviderMain9002 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentProviderMain9002.class, args);
    }
}
