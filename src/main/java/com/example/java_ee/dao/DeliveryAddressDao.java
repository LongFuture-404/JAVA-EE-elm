package com.example.java_ee.dao;

import com.example.java_ee.entity.DeliveryAddress;

import javax.annotation.Resource;
import java.util.List;

@Resource(name = "deliveryAddressDao")
public interface DeliveryAddressDao {

    void Insert(DeliveryAddress deliveryAddress);
    void Update(DeliveryAddress deliveryAddress);
    void Remove(Integer daId);

    List<DeliveryAddress> Select(String userId);
    DeliveryAddress SelectSingle(Integer daId);
}
