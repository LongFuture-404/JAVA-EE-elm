package com.example.java_ee.service.Impl;

import com.example.java_ee.dao.CartDao;
import com.example.java_ee.dao.UserDao;
import com.example.java_ee.entity.Cart;
import com.example.java_ee.service.CartService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("cartServiceImpl")
public class CartServiceImpl implements CartService {
    @Resource(name = "cartDao")
    CartDao cartDao;
    public List<Cart> SelectCart(Cart cart){
        return cartDao.Select(cart);
    }
    public void InsertCart(Cart cart){
        cartDao.Insert(cart);
    }
    public void UpdateCart(Cart cart){
        cartDao.Update(cart);
    }

    public void RemoveCart(Cart cart){
        cartDao.Remove(cart);
    }
}
