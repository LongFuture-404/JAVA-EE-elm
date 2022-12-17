package com.example.java_ee.service;

import com.example.java_ee.entity.Orders;

import java.util.List;

public interface OrdersService {
    Integer OrderInsert(Orders orders);
    List<Orders> OrderSelect(String userId);
    List<Orders> OrderSelectSingle(Integer orderId);
}
