package com.example.java_ee.Controller;

import com.example.java_ee.entity.User;
import com.example.java_ee.service.DeliveryAddressService;
import com.example.java_ee.service.UserService;
import org.springframework.web.bind.annotation.*;
import com.example.java_ee.entity.DeliveryAddress;

import javax.annotation.Resource;
import java.util.List;

@RestController("DeliveryAddressController")
@RequestMapping("/DeliveryAddressController")
@CrossOrigin
public class DeliveryAddressController {

    @Resource(name = "deliveryAddressServiceImpl")
    DeliveryAddressService service;
    @ResponseBody
    @RequestMapping("/saveDeliveryAddress")
    public int AddUserAddress(DeliveryAddress deliveryAddress) throws Exception {
        try{
            service.DeliveryAddressInsert(deliveryAddress);
            return 1;
        }
        catch (Exception e){
            return 0;
        }
    }

    @ResponseBody
    @RequestMapping("/updateDeliveryAddress")
    public int UpdateDeliveryAddress(DeliveryAddress deliveryAddress) throws Exception {
        try{
            service.DeliveryAddressUpdate(deliveryAddress);
            return 1;
        }
        catch (Exception e){
            return 0;
        }
    }
    @ResponseBody
    @RequestMapping("/removeDeliveryAddress")
    public int  RemoveDeliveryAddress(@RequestParam("daId") Integer daId) throws Exception {
        try{
            service.DeliveryAddressRemove(daId);
            return 1;
        }
        catch (Exception e){
            e.printStackTrace();
            return 0;
        }
    }

    @ResponseBody
    @RequestMapping("/listDeliveryAddressByUserId")
    public List<DeliveryAddress> ListDeliveryAddressByUserId(String userId) throws Exception {
        try{
            return service.DeliveryAddressSelect(userId);
        }
        catch (Exception e){
            return null;
        }
    }

    @ResponseBody
    @RequestMapping("/getDeliveryAddressById")
    public DeliveryAddress GetDeliveryAddressById(@RequestParam("daId") Integer daId) throws Exception {
        try{
            return service.DeliveryAddressSelectSingle(daId);
        }
        catch (Exception e){
            return null;
        }
    }
}
