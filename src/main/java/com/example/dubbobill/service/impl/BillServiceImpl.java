package com.example.dubbobill.service.impl;


import com.example.dubbobill.dao.BillMapper;
import com.example.dubbobill.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@com.alibaba.dubbo.config.annotation.Service
public class BillServiceImpl implements BillService {
    @Autowired
    BillMapper billMapper;
    @Override
    @Transactional
    public int killgoods(Long id, int goodsPrice) {
        return billMapper.killgoods(id, goodsPrice);
    }

    @Override
    @Transactional
    public int addmoney(Long id, int money) {
        return billMapper.addmoney(id, money);
    }

}
