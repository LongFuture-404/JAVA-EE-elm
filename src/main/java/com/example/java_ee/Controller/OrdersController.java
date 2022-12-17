package com.example.java_ee.Controller;

import com.example.java_ee.entity.Orders;
import com.example.java_ee.service.OrdersService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController("OrdersController")
@RequestMapping("/OrdersController")
@CrossOrigin
public class OrdersController {
    @Resource(name = "ordersServiceImpl")
    OrdersService service;
    @ResponseBody
    @RequestMapping("/createOrders")
    public int CreateOrders(@RequestParam("userId")String userId,
                            @RequestParam("businessId")Integer businessId,
                            @RequestParam("daId")Integer daId,
                            @RequestParam("orderTotal") BigDecimal orderTotal) throws Exception {
        try {
            Date date=new Date();
            SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss");
            Orders orders=new Orders(null,userId,businessId,dateFormat.format(date),orderTotal,daId,null);
            return service.OrderInsert(orders);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    @ResponseBody
    @RequestMapping("/listOrdersByUserId")
    public List<Orders> ListOrdersByUserId(@RequestParam("userId")String userId) throws Exception {
        try {
            return service.OrderSelect(userId);
        } catch (Exception e) {
            return null;
        }
    }
    @ResponseBody
    @RequestMapping("/getOrdersById")
    public List<Orders> GetOrdersById(@RequestParam("orderId")Integer orderId) throws Exception {
        try {
            return service.OrderSelectSingle(orderId);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
