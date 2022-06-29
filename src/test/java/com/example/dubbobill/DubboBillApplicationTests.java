package com.example.dubbobill;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.dubbobill.service.BillService;
import com.example.dubbobill.service.impl.BillServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

import javax.annotation.Resource;


@SpringBootTest
class DubboBillApplicationTests {
    @Autowired
    BillService billService;
    @Test
    void contextLoads() {
        long u=1000;
        System.out.println(billService.addmoney(u,1000));
    }

}
