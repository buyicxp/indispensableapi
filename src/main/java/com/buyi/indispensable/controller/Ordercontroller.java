package com.buyi.indispensable.controller;

import com.buyi.indispensable.entity.Order;
import com.buyi.indispensable.service.Orderservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ordercontroller {
    @Autowired
    private Orderservice orderservice;
    @PostMapping("orderInsert")
    public int orderInsert(@RequestParam(value = "u_id") long u_id,
                           @RequestParam(value = "t_id") long t_id ){
        Order order = new Order();
        order.setuId(u_id);
        order.settId(t_id);
        int res = orderservice.orderInsert(order);
        return res;
    }
}
