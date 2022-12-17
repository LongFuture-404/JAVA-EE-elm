package com.example.java_ee.service.Impl;

import com.example.java_ee.dao.BusinessDao;
import com.example.java_ee.dao.CartDao;
import com.example.java_ee.entity.Business;
import com.example.java_ee.service.BusinessService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("businessServiceImpl")
public class BusinessServiceImpl implements BusinessService {
    @Resource(name = "businessDao")
    BusinessDao businessDao;
    @Override
    public List<Business> SelectBusinessByOrderTypeId(Integer orderTypeId) {
        return businessDao.SelectByOrderTypeId(orderTypeId);
    }

    @Override
    public Business SelectBusinessByBusinessId(Integer businessId) {
        return businessDao.SelectByBusinessId(businessId);
    }
}
