package com.bay.springcloudalibaba.controller;

import com.bay.springcloud.entities.CommonResult;
import com.bay.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @ClassName PaymentController
 * @Description TODO
 * @Author baymux
 * @Date 2020/5/16 12:27
 * @Vsrsion 1.0
 **/
@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    public static HashMap<Long, Payment> paymentHashMap = new HashMap<>();

    static {
        paymentHashMap.put(1L, new Payment(1L, "222333444"));
        paymentHashMap.put(2L, new Payment(2L, "333444555"));
        paymentHashMap.put(3L, new Payment(3L, "444555666"));
        paymentHashMap.put(4L, new Payment(4L, "555666777"));
    }

    @GetMapping("/paymentSQL/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id) {
        Payment payment = paymentHashMap.get(id);
        CommonResult<Payment> paymentCommonResult = new CommonResult<>(200, "from mysql, serverPort: " + serverPort, payment);
        return paymentCommonResult;
    }

}
