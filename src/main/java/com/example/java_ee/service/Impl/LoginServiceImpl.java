package com.example.java_ee.service.Impl;

import com.example.java_ee.dao.LoginDao;
//import com.example.java_ee.entity.Operation;
import com.example.java_ee.service.LoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("loginServiceImpl")
public class LoginServiceImpl implements LoginService {

    @Resource(name = "loginDao")
    LoginDao logDao;


//    @Override
//    public void AddLog(Operation operation) {
//        logDao.Add(operation);
//    }

    @Override
    public void SuccessLog() {
        logDao.Success();
    }

    @Override
    public void FailLog() {
        logDao.Fail();
    }
}
