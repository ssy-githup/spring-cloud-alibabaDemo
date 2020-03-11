package com.ssy.mapper;

import com.ssy.entity.PayInfo;

/**
 * Created by smlz on 2019/11/20.
 */
public interface PayInfoMapper {

    PayInfo selectPayInfoByOrderNo(String orderNo);
}
