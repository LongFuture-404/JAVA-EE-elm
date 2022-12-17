package com.example.java_ee.Controller;

import com.example.java_ee.entity.Cart;
import com.example.java_ee.service.CartService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController("CartController")
@RequestMapping("/CartController")
@CrossOrigin
public class CartController {
    @Resource(name = "cartServiceImpl")
    CartService service;

    @ResponseBody
    @RequestMapping("/saveCart")
    public int SaveCart(@RequestParam("businessId")Integer businessId,
                        @RequestParam("userId")String userId,
                        @RequestParam("foodId")Integer foodId) throws Exception {
        try{
            Cart cart=new Cart(foodId,businessId,userId,null);
            service.InsertCart(cart);
            return 1;
        }catch (Exception e){
            return 0;
        }
    }

    @ResponseBody
    @RequestMapping("/listCart")
    public List<Cart> ListCart(@RequestParam("userId")String userId,
                               @RequestParam(value = "businessId",required = false)Integer businessId) throws Exception {
        try{
            Cart cart=new Cart(null,businessId,userId,null);
            return service.SelectCart(cart);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @ResponseBody
    @RequestMapping("/updateCart")
    public int UpdateCart(@RequestParam("businessId")Integer businessId,
                          @RequestParam("userId")String userId,
                          @RequestParam("foodId")Integer foodId,
                          @RequestParam("quantity")Integer quantity) throws Exception {
        try{
            Cart cart=new Cart(foodId,businessId,userId,quantity);
            service.UpdateCart(cart);
            return 1;
        }catch (Exception e){
            return 0;
        }
    }

    @ResponseBody
    @RequestMapping("/removeCart")
    public int RemoveCart(@RequestParam("businessId")Integer businessId,
                          @RequestParam("userId")String userId,
                          @RequestParam("foodId")Integer foodId) throws Exception {
        try{
            Cart cart=new Cart(foodId,businessId,userId,null);
            service.RemoveCart(cart);
            return 1;
        }catch (Exception e){
            return 0;
        }
    }
}
