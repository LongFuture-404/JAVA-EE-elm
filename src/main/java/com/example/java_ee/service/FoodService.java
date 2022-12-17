package com.example.java_ee.service;

import com.example.java_ee.entity.Food;

import java.util.List;

public interface FoodService {

    List<Food> SelectFood(Integer businessId);
}
