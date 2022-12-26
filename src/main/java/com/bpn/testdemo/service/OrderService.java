package com.bpn.testdemo.service;


import com.bpn.testdemo.dtos.OrderDto;
import com.bpn.testdemo.entity.Order;

import java.util.List;

public interface OrderService {

    Order save(Order order);

    Order getById(Long id);

    List<OrderDto> getOrderList();
}
