package com.zyj.springcloud.controller;

import com.zyj.springcloud.entities.CommonResult;
import com.zyj.springcloud.entities.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Author zyj
 * @Date 2020-08-05 9:49
 * @Version 1.0
 */
@RestController
public class OrderController {

    public static final String PATMENT_URL = "http://CLOUD-PAYMENT-SERVICE";
//    public static final String PATMENT_URL = "http://localhost:8001";  // 单机操作

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment){
        System.out.println("create");
        return restTemplate.postForObject(PATMENT_URL + "/payment/create" , payment, CommonResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id){
        System.out.println("get");
        return restTemplate.getForObject(PATMENT_URL + "/payment/get/" + id, CommonResult.class);
    }
}
