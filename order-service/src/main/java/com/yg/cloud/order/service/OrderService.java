package com.yg.cloud.order.service;

import com.yg.cloud.order.mapper.OrderMapper;
import com.yg.cloud.order.pojo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private OrderMapper orderMapper;

    public Order queryOrderById(Long orderId) {
        Order order = orderMapper.findById(orderId);
        return order;
    }
}
