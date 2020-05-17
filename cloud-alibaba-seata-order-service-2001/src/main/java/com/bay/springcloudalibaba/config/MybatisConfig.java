package com.bay.springcloudalibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName MybatisConfig
 * @Description TODO
 * @Author baymux
 * @Date 2020/5/16 23:37
 * @Vsrsion 1.0
 **/
@Configuration
@MapperScan({"com.bay.springcloudalibaba.dao"})
public class MybatisConfig {
}
