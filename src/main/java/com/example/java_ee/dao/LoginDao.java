package com.example.java_ee.dao;

//import com.example.realproject.entity.Operation;
import org.springframework.stereotype.Repository;

@Repository("loginDao")
public interface LoginDao {

//    void Add(Operation operation);

    void Success();

    void Fail();
}
