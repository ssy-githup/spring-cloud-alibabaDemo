package com.ssy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssy.entity.ProductInfo;
import com.ssy.mapper.ProductInfoMapper;

import java.util.List;


@RestController
public class ProductInfoController {


    @Autowired
    private ProductInfoMapper productInfoMapper;

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("/queryOrderByNum/{productNo}")
    public Object selectProductInfoById(@PathVariable("productNo") String productNo) {

        ProductInfo productInfo = productInfoMapper.selectProductInfoById(productNo);
        return productInfo;
    }

    //验证我们的order-center注册到我们的nacos上
    @GetMapping("/getServiceList")
    public List<ServiceInstance> getServiceList() {
        List<ServiceInstance> serviceInstanceList =  discoveryClient.getInstances("product-center");
        return serviceInstanceList;
    }
}
