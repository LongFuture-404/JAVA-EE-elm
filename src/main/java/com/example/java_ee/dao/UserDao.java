package com.example.java_ee.dao;

import com.example.java_ee.entity.User;

import javax.annotation.Resource;

@Resource(name = "userDao")
public interface UserDao {
    User SelectSingle(String userId);

    void Insert(User user);

}
