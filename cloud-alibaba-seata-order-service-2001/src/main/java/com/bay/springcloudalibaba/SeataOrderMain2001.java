package com.bay.springcloudalibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName SeataOrderMain2001
 * @Description TODO
 * @Author baymux
 * @Date 2020/5/16 22:42
 * @Vsrsion 1.0
 **/
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class) // 取消数据源自动创建
@EnableFeignClients
@EnableDiscoveryClient
public class SeataOrderMain2001 {
    public static void main(String[] args) {
        SpringApplication.run(SeataOrderMain2001.class, args);
    }
}
