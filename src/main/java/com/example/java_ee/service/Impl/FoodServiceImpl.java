package com.example.java_ee.service.Impl;

import com.example.java_ee.dao.FoodDao;
import com.example.java_ee.dao.LoginDao;
import com.example.java_ee.entity.Food;
import com.example.java_ee.service.FoodService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("foodServiceImpl")
public class FoodServiceImpl implements FoodService {

    @Resource(name = "foodDao")
    FoodDao foodDao;
    public List<Food> SelectFood(Integer businessId){
        return foodDao.Select(businessId);
    }

}
