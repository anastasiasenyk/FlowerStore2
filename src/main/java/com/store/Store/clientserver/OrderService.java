package com.store.Store.clientserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping(path = "orders")
public class OrderService {
    private static List<Order> orders;

    @GetMapping
    public List<Order> getOrders(){
        return orders;
    }

    public void addOrder(Order order){
        orders.add(order);
    }

}
