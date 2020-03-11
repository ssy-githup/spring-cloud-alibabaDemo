package com.ssy.mapper;

import com.ssy.entity.OrderInfo;

public interface OrderInfoMapper {

    OrderInfo selectOrderInfoById(String orderNo);
}
