package com.example.java_ee.dao;

import com.example.java_ee.entity.Food;

import javax.annotation.Resource;
import java.util.List;

@Resource(name = "foodDao")
public interface FoodDao {
    List<Food> Select(Integer businessId);
}
