package com.zyj.springcloud.service.impl;

import com.zyj.springcloud.dao.PaymentDao;
import com.zyj.springcloud.entities.Payment;
import com.zyj.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @description:
 * @author: zyj
 * @time: 2020-08-04 23:10
 */
@Service
public class PaymentServiceImpl  implements PaymentService{
    @Resource
    private PaymentDao paymentDao;
    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    public Payment getPaymentById( Long id){
        return paymentDao.getPaymentById(id);
    }
}
