package com.example.java_ee.service.Impl;

import com.example.java_ee.dao.OrdersDao;
import com.example.java_ee.entity.Orders;
import com.example.java_ee.service.OrdersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("ordersServiceImpl")
public class OrdersServiceImpl implements OrdersService {
    @Resource(name = "ordersDao")
    OrdersDao ordersDao;

    @Override
    public Integer OrderInsert(Orders orders) {
        ordersDao.Insert(orders);
        return ordersDao.SelectOrderId(orders.getDate());
    }

    @Override
    public List<Orders> OrderSelect(String userId) {
        return ordersDao.Select(userId);
    }

    @Override
    public List<Orders> OrderSelectSingle(Integer orderId) {
        return ordersDao.SelectSingle(orderId);
    }
}
