package com.bpn.testdemo.dtos;

import lombok.Data;

@Data
public class OrderDetailsDto {

    private Long id;
    private String productName;
    private String quantity;
    private String rate;

}
