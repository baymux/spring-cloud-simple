package com.bay.springcloudalibaba.service;

import com.bay.springcloudalibaba.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @ClassName AccountService
 * @Description TODO
 * @Author baymux
 * @Date 2020/5/16 23:16
 * @Vsrsion 1.0
 **/
@FeignClient(value = "cloud-seata-account-service")
public interface AccountService {

    /**
     * 调用库存微服务对账户做减法
     * @param userId
     * @param money
     * @return
     */
    @PostMapping(value = "/account/decrease")
    CommonResult decrease(@RequestParam("userId") Long userId,
                          @RequestParam("money") BigDecimal money);

}
