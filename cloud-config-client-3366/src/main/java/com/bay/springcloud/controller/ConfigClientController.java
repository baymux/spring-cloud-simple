package com.bay.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ConfigClientController
 * @Description TODO
 * @Author baymux
 * @Date 2020/5/13 10:47
 * @Vsrsion 1.0
 **/
@RestController
@RefreshScope // 刷新
public class ConfigClientController {

    @Value("${server.port}")
    private String serverPort;

    @Value("${config.info}")
    private String configInfo;


    @GetMapping("/configInfo")
    public String getConfigInfo() {
        return "serverPort：" + serverPort + "\t\n\n configInfo: " + configInfo;
    }
}
