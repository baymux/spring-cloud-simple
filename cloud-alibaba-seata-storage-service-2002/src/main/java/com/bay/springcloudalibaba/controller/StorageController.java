package com.bay.springcloudalibaba.controller;

import com.bay.springcloudalibaba.domain.CommonResult;
import com.bay.springcloudalibaba.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName StorageController
 * @Description TODO
 * @Author baymux
 * @Date 2020/5/17 0:27
 * @Vsrsion 1.0
 **/
@RestController
@Slf4j
public class StorageController {

    @Resource
    private StorageService storageService;


    @PostMapping("/storage/decrease")
    public CommonResult decrease(Long productId, Integer count) {
        storageService.decrease(productId, count);
        return new CommonResult(200, "库存扣减成功");
    }
}
