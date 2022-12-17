package com.example.java_ee.dao;

import com.example.java_ee.entity.User;
import org.apache.ibatis.annotations.Param;

import javax.annotation.Resource;
import java.sql.Blob;
import java.util.List;
import java.util.Map;

@Resource(name = "userDao")
public interface UserDao {
    User SelectSingle(String userId);

    void Insert(User user);

//    User Flushed(@Param("checkUser")User checkUsers,@Param("user")User user);
//    /**
//     * 登录接口
//     */
//    void UpdatePW(User user);
//
//    void Lock(String userId);
//
//    Integer GetResult();
//
//    void SetResult(Map<String,Object> map);
//
//    void NoResult();
//    Map GetImage(String userId);
//
//    void DeleteU(String userId);
//
//    void UpdateU(User user);
//    int findTotalCount(@Param("map")Map<String, Object> map);
//    List<User> findByPage(@Param("start")int start,@Param("rows")int rows,@Param("map")Map<String, Object> map);
}
