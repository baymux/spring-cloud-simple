package com.bay.springcloudalibaba.controller;

import com.bay.springcloudalibaba.domain.CommonResult;
import com.bay.springcloudalibaba.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @ClassName AccountControllrt
 * @Description TODO
 * @Author baymux
 * @Date 2020/5/17 0:57
 * @Vsrsion 1.0
 **/
@RestController
@Slf4j
public class AccountController {

    @Resource
    private AccountService accountService;


    @PostMapping("/account/decrease")
    public CommonResult decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money) {
        accountService.decrease(userId, money);
        return new CommonResult(200, "账户扣减成功");
    }
}
