package com.bay.springcloud.dao;

import com.bay.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName PaymentDao
 * @Description TODO
 * @Author baymux
 * @Date 2020/5/6 14:56
 * @Vsrsion 1.0
 **/
@Mapper
public interface PaymentDao {

    /**
     * 写
     * @param payment
     * @return
     */
    public int create(Payment payment);

    /**
     * 读
     * @param id
     * @return
     */
    public Payment getPaymentById(@Param("id") Long id);
}
