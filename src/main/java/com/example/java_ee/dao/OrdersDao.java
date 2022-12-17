package com.example.java_ee.dao;

import com.example.java_ee.entity.Orders;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("ordersDao")
public interface OrdersDao {

    void Insert(Orders orders);

    List<Orders> Select(String userId);

    List<Orders> SelectSingle(Integer orderId);
    Integer SelectOrderId(String date);
}
