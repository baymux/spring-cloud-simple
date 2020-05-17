package com.bay.springcloud.service;

import com.bay.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName PaymentService
 * @Description TODO
 * @Author baymux
 * @Date 2020/5/6 15:10
 * @Vsrsion 1.0
 **/
public interface PaymentService {
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
