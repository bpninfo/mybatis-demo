package com.bpn.testdemo.mapper;

import com.bpn.testdemo.dtos.OrderDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {

    List<OrderDto> getOrder();

}
