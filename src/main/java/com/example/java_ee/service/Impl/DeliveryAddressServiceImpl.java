package com.example.java_ee.service.Impl;

import com.example.java_ee.dao.DeliveryAddressDao;
import com.example.java_ee.entity.DeliveryAddress;
import com.example.java_ee.service.DeliveryAddressService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("deliveryAddressServiceImpl")
public class DeliveryAddressServiceImpl implements DeliveryAddressService {
    @Resource(name = "deliveryAddressDao")
    DeliveryAddressDao deliveryAddressdao;
    public void DeliveryAddressInsert(DeliveryAddress deliveryAddress){
        deliveryAddressdao.Insert(deliveryAddress);
    }

    @Override
    public void DeliveryAddressUpdate(DeliveryAddress deliveryAddress) {
        deliveryAddressdao.Update(deliveryAddress);
    }

    @Override
    public void DeliveryAddressRemove(Integer daId) {
        deliveryAddressdao.Remove(daId);
    }

    @Override
    public List<DeliveryAddress> DeliveryAddressSelect(String userId) {
        return deliveryAddressdao.Select(userId);
    }

    @Override
    public DeliveryAddress DeliveryAddressSelectSingle(Integer daId) {
        return deliveryAddressdao.SelectSingle(daId);
    }
}
