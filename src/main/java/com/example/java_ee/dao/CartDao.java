package com.example.java_ee.dao;

import com.example.java_ee.entity.Cart;

import javax.annotation.Resource;
import java.util.List;

@Resource(name = "cartDao")
public interface CartDao {
    List<Cart> Select(Cart cart);
    void Insert(Cart cart);
    void Update(Cart cart);

    void Remove(Cart cart);
}
