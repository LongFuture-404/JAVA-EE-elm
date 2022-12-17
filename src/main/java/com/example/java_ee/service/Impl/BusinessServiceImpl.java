package com.example.java_ee.service.Impl;

import com.example.java_ee.dao.BusinessDao;
import com.example.java_ee.entity.Business;
import com.example.java_ee.service.BusinessService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("businessServiceImpl")
public class BusinessServiceImpl implements BusinessService {
    @Resource(name = "businessDao")
    BusinessDao businessDao;
    @Override
    public List<Business> SelectBusinessByOrderTypeId(Integer orderTypeId) {
        try{
            return businessDao.SelectByOrderTypeId(orderTypeId);
        }
        catch (Exception e){
            return null;
        }
    }

    @Override
    public Business SelectBusinessByBusinessId(Integer businessId) {
        try {
            return businessDao.SelectByBusinessId(businessId);
        }
        catch (Exception e){
            return null;
        }
    }
}
