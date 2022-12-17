package com.example.java_ee.Controller;

import com.example.java_ee.entity.Business;
import com.example.java_ee.entity.DeliveryAddress;
import com.example.java_ee.service.CartService;
import com.example.java_ee.service.Impl.BusinessServiceImpl;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController("BusinessController")
@RequestMapping("/BusinessController")
@CrossOrigin
public class BusinessController {

    @Resource(name = "businessServiceImpl")
    BusinessServiceImpl service;
    @ResponseBody
    @RequestMapping("/listBusinessByOrderTypeId")
    public List<Business> ListBusinessByOrderTypeId(@RequestParam(value = "orderTypeId")Integer orderTypeId) throws Exception {
        try {
            return service.SelectBusinessByOrderTypeId(orderTypeId);
        } catch (Exception e) {
            return null;
        }
    }

    @ResponseBody
    @RequestMapping("/getBusinessById")
    public Business GetBusinessById(@RequestParam(value = "businessId")Integer businessId) throws Exception {
        try {
            return service.SelectBusinessByBusinessId(businessId);
        } catch (Exception e) {
            return null;
        }
    }
}
