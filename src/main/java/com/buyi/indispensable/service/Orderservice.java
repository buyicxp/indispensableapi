package com.buyi.indispensable.service;

import com.buyi.indispensable.entity.Order;

public interface Orderservice {
    /**
     * 添加一条订单
     * @param order
     * @return
     */
    int orderInsert(Order order);
}
