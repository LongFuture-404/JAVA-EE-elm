package com.example.java_ee.service;

import com.example.java_ee.entity.Cart;

import java.util.List;

public interface CartService {

    List<Cart> SelectCart(Cart cart);

    void InsertCart(Cart cart);

    void UpdateCart(Cart cart);

    void RemoveCart(Cart cart);
}
