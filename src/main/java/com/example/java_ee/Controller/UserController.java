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
        //调用service层  (账号以及密码同时传入service/dao/)
        User user=service.UserSelect(acount);
        //判定账号是否存在
        if(user!=null && user.getPassword().equals(pwd)){
            return user;
        }
        else{
            return null;
        }

//        List<permissions> userPri= service.getUserPri(user.getR_id());
//        user.setPriList(userPri);
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