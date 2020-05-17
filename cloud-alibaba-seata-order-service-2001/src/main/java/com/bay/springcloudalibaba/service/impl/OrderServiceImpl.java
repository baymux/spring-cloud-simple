package com.bay.springcloudalibaba.service.impl;

import com.bay.springcloudalibaba.dao.OrderDao;
import com.bay.springcloudalibaba.domain.Order;
import com.bay.springcloudalibaba.service.AccountService;
import com.bay.springcloudalibaba.service.OrderService;
import com.bay.springcloudalibaba.service.StorageService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName OrderServiceImpl
 * @Description TODO
 * @Author baymux
 * @Date 2020/5/16 23:14
 * @Vsrsion 1.0
 **/
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderDao orderDao;
    @Resource
    private StorageService storageService;
    @Resource
    private AccountService accountService;


    @Override
    @GlobalTransactional(name = "bay_tx_group", rollbackFor = Exception.class)
    public void create(Order order) {
        log.info("-------> 开始新建订单");
        orderDao.create(order);

        log.info("------>订单微服务开始调用库存,做扣减");
        storageService.decrease(order.getProductId(), order.getCount());
        log.info("------>订单微服务开始调用库存,做扣减 end");

        log.info("------>订单微服务开始调用账户,做扣减");
        accountService.decrease(order.getUserId(), order.getMoney());
        log.info("------>订单微服务开始调用账户,做扣减 end");

        // 修改订单状态,从0到1表示已经完成
        log.info("------>修改订单状态开始");
        orderDao.update(order.getUserId(), 0);
        log.info("------>修改订单状态结束");

        log.info("----->订单结束,o(*￣▽￣*)ブ");
    }
}
