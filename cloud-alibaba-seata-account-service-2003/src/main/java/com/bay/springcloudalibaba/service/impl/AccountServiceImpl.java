package com.bay.springcloudalibaba.service.impl;

import com.bay.springcloudalibaba.dao.AccountDao;
import com.bay.springcloudalibaba.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.omg.CORBA.TIMEOUT;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName AccountServiceImpl
 * @Description TODO
 * @Author baymux
 * @Date 2020/5/17 0:55
 * @Vsrsion 1.0
 **/
@Service
@Slf4j
public class AccountServiceImpl implements AccountService {

    @Resource
    private AccountDao accountDao;

    @Override
    public void decrease(Long userId, BigDecimal money) {

        log.info("账户服务开始扣减....");

        accountDao.decrease(userId, money);
        try {
            TimeUnit.SECONDS.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("账户服务,扣减结束");
    }
}
