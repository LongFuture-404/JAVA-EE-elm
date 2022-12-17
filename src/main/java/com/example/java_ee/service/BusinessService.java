package com.example.java_ee.service;

import com.example.java_ee.entity.Business;

import java.util.List;

public interface BusinessService {

    List<Business> SelectBusinessByOrderTypeId(Integer orderTypeId);

    Business SelectBusinessByBusinessId(Integer businessId);
}
