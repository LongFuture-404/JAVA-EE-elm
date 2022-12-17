package com.example.java_ee.Controller;

import com.example.java_ee.entity.Food;
import com.example.java_ee.service.CartService;
import com.example.java_ee.service.FoodService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController("FoodController")
@RequestMapping("/FoodController")
@CrossOrigin
public class FoodController {

    @Resource(name = "foodServiceImpl")
    FoodService service;
    @ResponseBody
    @RequestMapping("/listFoodByBusinessId")
    public List<Food> ListFoodByBusinessId(@RequestParam("businessId")Integer businessId) throws Exception {
        try {
            return service.SelectFood(businessId);
        } catch (Exception e) {
            return null;
        }
    }
}
