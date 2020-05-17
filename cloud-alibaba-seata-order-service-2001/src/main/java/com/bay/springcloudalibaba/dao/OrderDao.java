package com.bay.springcloudalibaba.dao;

import com.bay.springcloudalibaba.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName OrderDao
 * @Description TODO
 * @Author baymux
 * @Date 2020/5/16 22:52
 * @Vsrsion 1.0
 **/
@Mapper
public interface OrderDao {

    /**
     * 新建订单
     *
     * @param order
     */
    void create(Order order);

    /**
     * 修改订单状态 0 --> 1
     *
     * @param userID
     * @param status
     */
    void update(@Param("userId") Long userID, @Param("status") Integer status);

}
