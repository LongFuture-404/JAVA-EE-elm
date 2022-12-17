package com.example.java_ee.service;

import com.example.java_ee.entity.DeliveryAddress;

import java.util.List;

public interface DeliveryAddressService {

    void DeliveryAddressInsert(DeliveryAddress deliveryAddress);
    void DeliveryAddressUpdate(DeliveryAddress deliveryAddress);
    void DeliveryAddressRemove(Integer daId);
    List<DeliveryAddress> DeliveryAddressSelect(String userId);
    DeliveryAddress DeliveryAddressSelectSingle(Integer daId);

}
