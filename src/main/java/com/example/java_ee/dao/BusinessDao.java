package com.example.java_ee.dao;

import com.example.java_ee.entity.Business;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Resource(name = "businessDao")
public interface BusinessDao {

    List<Business> SelectByOrderTypeId(Integer orderTypeId);

    Business SelectByBusinessId(Integer businessId);
}
