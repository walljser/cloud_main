package com.yg.cloud.order.web;

import com.yg.cloud.order.pojo.Order;
import com.yg.cloud.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("{orderId}")
    public Order queryOrderById(@PathVariable("orderId") Long orderId) {
        return orderService.queryOrderById(orderId);
    }
}
