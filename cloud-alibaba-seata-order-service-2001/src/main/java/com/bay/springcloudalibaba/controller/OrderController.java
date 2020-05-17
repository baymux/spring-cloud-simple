package com.bay.springcloudalibaba.controller;

import com.bay.springcloudalibaba.domain.CommonResult;
import com.bay.springcloudalibaba.domain.Order;
import com.bay.springcloudalibaba.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName OrderController
 * @Description TODO
 * @Author baymux
 * @Date 2020/5/16 23:34
 * @Vsrsion 1.0
 **/
@RestController
@Slf4j
public class OrderController {

    @Resource
    private OrderService orderService;

    @GetMapping("/order/create")
    public CommonResult<Order> create(Order order) {
        orderService.create(order);
        return new CommonResult<>(200, "订单创建成功");
    }
}
