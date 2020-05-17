package com.bay.springcloudalibaba.service;

import com.bay.springcloudalibaba.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName StorageService
 * @Description TODO
 * @Author baymux
 * @Date 2020/5/16 23:16
 * @Vsrsion 1.0
 **/
@FeignClient(value = "cloud-seata-storage-service")
public interface StorageService {

    /**
     * 调用库存微服务对库存做减法
     *
     * @param productId
     * @param count
     * @return
     */
    @PostMapping(value = "/storage/decrease")
    CommonResult decrease(@RequestParam("productId") Long productId,
                          @RequestParam("count") Integer count);
}
