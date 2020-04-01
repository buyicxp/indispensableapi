package com.buyi.indispensable.dao;

import com.buyi.indispensable.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface Ordermapper {
    /**
     * 添加一条订单
     * @param order
     * @return
     */
    int orderInsert(Order order);
}
