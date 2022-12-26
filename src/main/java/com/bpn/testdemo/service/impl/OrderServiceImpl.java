package com.bpn.testdemo.service.impl;

import com.bpn.testdemo.dtos.OrderDto;
import com.bpn.testdemo.entity.Order;
import com.bpn.testdemo.mapper.OrderMapper;
import com.bpn.testdemo.repository.OrderDetailsRepository;
import com.bpn.testdemo.repository.OrderRepository;
import com.bpn.testdemo.service.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;
    private final OrderDetailsRepository orderDetailsRepository;
    private final OrderMapper orderMapper;

    public OrderServiceImpl(OrderRepository orderRepository,
                            OrderDetailsRepository orderDetailsRepository,
                            OrderMapper orderMapper){
        this.orderRepository = orderRepository;
        this.orderDetailsRepository = orderDetailsRepository;
        this.orderMapper = orderMapper;
    }

    @Override
    public Order save(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public Order getById(Long id) {
        return orderRepository.findById(id).orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @Override
    public List<OrderDto> getOrderList() {
        return orderMapper.getOrder();
    }
}
