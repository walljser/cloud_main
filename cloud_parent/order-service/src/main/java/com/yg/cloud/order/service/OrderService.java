package com.yg.cloud.order.service;

import com.yg.cloud.feign.pojo.User;
import com.yg.cloud.order.mapper.OrderMapper;
import com.yg.cloud.order.pojo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private RestTemplate restTemplate;

    public Order findByOrderId(Long orderId) {
        Order order = orderMapper.selectById(orderId);
        String url = "http://userservice/user/" + order.getUserId();
        System.out.println(666);
        User user = restTemplate.getForObject(url, User.class);
        order.setUser(user);
        return order;
    }
}
