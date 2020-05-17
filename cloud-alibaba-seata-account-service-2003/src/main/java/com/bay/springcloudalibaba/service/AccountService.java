package com.bay.springcloudalibaba.service;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @ClassName AccountService
 * @Description TODO
 * @Author baymux
 * @Date 2020/5/17 0:53
 * @Vsrsion 1.0
 **/
public interface AccountService {

    void decrease(Long userId, BigDecimal money);
}
