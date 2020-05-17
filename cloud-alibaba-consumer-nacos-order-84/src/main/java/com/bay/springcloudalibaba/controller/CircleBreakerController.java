package com.bay.springcloudalibaba.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.bay.springcloud.entities.CommonResult;
import com.bay.springcloud.entities.Payment;
import com.bay.springcloudalibaba.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @ClassName CircleBreakerController
 * @Description TODO
 * @Author baymux
 * @Date 2020/5/16 13:05
 * @Vsrsion 1.0
 **/
@RestController
@Slf4j
public class CircleBreakerController {

    @Value("${service-uri.nacos-user-service}")
    private String SERVICE_UTL;


    @Resource
    private RestTemplate restTemplate;

    @Resource
    private PaymentService paymentService;


    @GetMapping("/consumer/fallback/{id}")
    //@SentinelResource(value = "fallback") 没有配置
    //@SentinelResource(value = "fallback", fallback = "handlerFallback")  //fallback 只负责业务异常
    //@SentinelResource(value = "fallback", blockHandler = "blockHandler")  //blockHandler 只负责sentinel控制台配置违规
    @SentinelResource(value = "fallback", blockHandler = "blockHandler", fallback = "handlerFallback",
            exceptionsToIgnore = {IllegalArgumentException.class})  //blockHandler 只负责sentinel控制台配置违规
    public CommonResult<Payment> fallback(@PathVariable("id") Long id) {
        CommonResult result = restTemplate.getForObject(SERVICE_UTL + "/paymentSQL/" + id, CommonResult.class);

        if (id == 5) {
            throw new IllegalArgumentException("IllegalArgumentException, 非法参数异常。。。。");
        } else if (result.getData() == null) {
            throw new NullPointerException("NullPointerException, 该ID没有对应记录，空指针异常");
        }

        return result;
    }


    // fallback
    public CommonResult<Payment> handlerFallback(@PathVariable("id") Long id, Throwable e) {
        Payment payment = new Payment(id, null);
        return new CommonResult<>(444, "兜底异常handlerFallback, exception内容： " + e.getMessage(), payment);
    }


    // blockHandler
    public CommonResult<Payment> blockHandler(@PathVariable("id") Long id, BlockException e) {
        Payment payment = new Payment(id, null);
        return new CommonResult<>(445, "blockHandler-sentinel限流,无此流水：blockException " + e.getMessage(), payment);
    }



    @GetMapping("/consumer/openfeign/{id}")
    CommonResult<Payment> paymentSQL(@PathVariable("id") Long id) {
        CommonResult<Payment> paymentCommonResult = paymentService.paymentSQL(id);
        return paymentCommonResult;
    }

}
