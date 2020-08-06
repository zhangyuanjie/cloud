package com.zyj.springcloud.service;

import com.zyj.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @description:
 * @author: zyj
 * @time: 2020-08-04 23:09
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
