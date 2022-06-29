package com.example.dubbobill.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Mapper
@Repository
public interface BillMapper {

    int killgoods(@Param("id") Long id, @Param("goodsPrice") int goodsPrice);
    int addmoney(@Param("id")Long id,@Param("money") int money);
}
