package com.ssy.mapper;

import com.ssy.entity.ProductInfo;


public interface ProductInfoMapper {

    ProductInfo selectProductInfoById(String productNo);
}
