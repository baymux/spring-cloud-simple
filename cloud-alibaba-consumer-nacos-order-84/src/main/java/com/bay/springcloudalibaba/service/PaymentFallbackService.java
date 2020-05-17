package com.bay.springcloudalibaba.service;

import com.bay.springcloud.entities.CommonResult;
import com.bay.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @ClassName PaymentFallbackService
 * @Description TODO
 * @Author baymux
 * @Date 2020/5/16 14:09
 * @Vsrsion 1.0
 **/
@Component
public class PaymentFallbackService implements PaymentService{
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(444, "服务降级返回, id: " + id, new Payment(id, null));
    }

}
