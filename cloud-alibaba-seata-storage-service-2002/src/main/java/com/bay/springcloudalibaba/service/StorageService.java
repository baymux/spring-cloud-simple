package com.bay.springcloudalibaba.service;

import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName StorageService
 * @Description TODO
 * @Author baymux
 * @Date 2020/5/17 0:23
 * @Vsrsion 1.0
 **/
public interface StorageService {

    /**
     * 扣减库存
     *
     * @param productId
     * @param count
     */
    void decrease(Long productId,Integer count);

}
