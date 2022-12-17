package com.example.java_ee.service;

import com.example.java_ee.entity.User;

public interface UserService {
    User UserSelect(String userId);

    void UserInsert(User user);

}
