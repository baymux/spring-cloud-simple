package com.bay.springcloudalibaba.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @ClassName AccountDao
 * @Description TODO
 * @Author baymux
 * @Date 2020/5/17 0:47
 * @Vsrsion 1.0
 **/
@Mapper
public interface AccountDao {

    /**
     * 账户做减法
     *
     * @param userId
     * @param money
     */
    void decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);
}
