package com.buyi.indispensable.serviceimp;

import com.buyi.indispensable.dao.Ordermapper;
import com.buyi.indispensable.entity.Order;
import com.buyi.indispensable.service.Orderservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Orderserviceimp implements Orderservice {
    @Autowired
    private Ordermapper ordermapper;
    @Override
    public int orderInsert(Order order) {
        return ordermapper.orderInsert(order);
    }
}
