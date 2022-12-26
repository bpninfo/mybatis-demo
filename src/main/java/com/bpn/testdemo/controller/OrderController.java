package com.bpn.testdemo.controller;

import com.bpn.testdemo.entity.Order;
import com.bpn.testdemo.service.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService){
        this.orderService = orderService;
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Order order){
        return ResponseEntity.status(HttpStatus.CREATED).body(orderService.save(order));
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(orderService.getById(id));
    }

    @GetMapping("/list")
    public ResponseEntity<?> getOrderList(){
        return ResponseEntity.status(HttpStatus.OK).body(orderService.getOrderList());
    }
}
