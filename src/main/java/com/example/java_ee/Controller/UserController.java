package com.example.java_ee.Controller;

import com.example.java_ee.entity.User;
//import com.example.java_ee.entity.permissions;
import com.example.java_ee.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@RestController("UserController")
@RequestMapping("/UserController")
@CrossOrigin
public class UserController {

    @Resource(name = "userServiceImpl")
    UserService service;

    @ResponseBody
    @RequestMapping("/getUserByIdByPass")
    public User login(@RequestParam(value = "userId") String acount,
                      @RequestParam(value = "password") String pwd) throws Exception {
        User user=service.UserSelect(acount);
        if(user!=null && user.getPassword().equals(pwd)){
            return user;
        }
        else{
            return null;
        }

    }
    @ResponseBody
    @RequestMapping("/getUserById")
    public int findUser(@RequestParam("userId") String acount) throws Exception {
        User user=service.UserSelect(acount);
        if(user!=null) {
            return 1;
        }
        else {
            return 0;
        }
    }
    @ResponseBody
    @RequestMapping("/saveUser")
    public int addUser(User user) throws Exception {
        try{
            service.UserInsert(user);
            return 1;
        } catch (Exception e) {
            return 0;
        }
    }

}