package com.bay.springcloud.controller;

import com.bay.springcloud.entities.CommonResult;
import com.bay.springcloud.entities.Payment;
import com.bay.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName OrderFeignController
 * @Description TODO
 * @Author baymux
 * @Date 2020/5/10 16:47
 * @Vsrsion 1.0
 **/
@RestController
@Slf4j
public class OrderFeignController {

    @Resource
    private PaymentFeignService paymentFeignService;


    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id) {
        return paymentFeignService.getPaymentById(id);
    }

    @GetMapping("/consumer/payment/feign/timeout")
    public String getPaymentTimeout() {
        // 客户端默认等待一秒钟
        return paymentFeignService.paymentFeignTimeout();
    }
}
