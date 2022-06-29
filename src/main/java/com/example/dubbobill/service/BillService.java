package com.example.dubbobill.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.apache.ibatis.annotations.Param;


public interface BillService {
    int killgoods(Long id,int goodsPrice);
    int addmoney(Long id, int money);
}
