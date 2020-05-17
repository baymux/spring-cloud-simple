package com.bay.springcloudalibaba.service;

import com.bay.springcloud.entities.CommonResult;
import com.bay.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @ClassName PaymentService
 * @Description TODO
 * @Author baymux
 * @Date 2020/5/16 13:53
 * @Vsrsion 1.0
 **/
@FeignClient(value = "cloud-alibaba-nacos-provider-payment", fallback = PaymentFallbackService.class)
public interface PaymentService {


    @GetMapping("/paymentSQL/{id}")
    CommonResult<Payment> paymentSQL(@PathVariable("id") Long id);
}
