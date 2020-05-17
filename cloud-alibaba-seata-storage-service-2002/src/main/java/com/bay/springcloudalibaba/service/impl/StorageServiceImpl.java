package com.bay.springcloudalibaba.service.impl;

import com.bay.springcloudalibaba.dao.StorageDao;
import com.bay.springcloudalibaba.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;

/**
 * @ClassName StorageServiceImpl
 * @Description TODO
 * @Author baymux
 * @Date 2020/5/17 0:24
 * @Vsrsion 1.0
 **/
@Service
@Slf4j
public class StorageServiceImpl implements StorageService {

    @Resource
    private StorageDao storageDao;

    @Override
    public void decrease(Long productId,Integer count) {

        log.info("扣减库存开始");
        storageDao.decrease(productId, count);
        log.info("扣减库存结束");
    }
}
