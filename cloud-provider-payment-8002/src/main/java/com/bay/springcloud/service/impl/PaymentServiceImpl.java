package com.bay.springcloud.service.impl;

import com.bay.springcloud.dao.PaymentDao;
import com.bay.springcloud.entities.Payment;
import com.bay.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName PaymentServiceImpl
 * @Description TODO
 * @Author baymux
 * @Date 2020/5/6 15:11
 * @Vsrsion 1.0
 **/
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
