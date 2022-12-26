package com.bpn.testdemo.dtos;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class OrderDto {

    private Long id;
    private String orderBy;
    private String orderDate;
    private Set<OrderDetailsDto> orderDetails = new HashSet<>();
}
