package com.bay.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @ClassName PaymentFallbackService
 * @Description TODO
 * @Author baymux
 * @Date 2020/5/11 10:48
 * @Vsrsion 1.0
 **/
@Component
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String paymentInfoOk(Integer id) {
        return "---PaymentHystrixService fall back";
    }

    @Override
    public String paymentInfoTimeout(Integer id) {
        return "---PaymentHystrixService fall back";
    }
}
