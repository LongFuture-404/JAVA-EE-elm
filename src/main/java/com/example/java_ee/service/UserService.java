package com.example.java_ee.service;

//import com.example.java_ee.entity.PageBean;
import com.example.java_ee.entity.User;
//import com.example.java_ee.entity.permissions;

import java.util.List;
import java.util.Map;

public interface UserService {
    User UserSelect(String userId);

    void UserInsert(User user);

//    void UserUpdatePW(User users);
//
//    void UserLock(String phone);
//
//    /**
//     * 权限查询
//     */
////    List<permissions> getUserPri (Integer R_id);
//
//    Integer UserResult();
//
//    void UserAddResult(Map<String,Object> map);
//
//    void RemoveResult();
//
////    PageBean<User> findUserByPage(String _currentPage, String _rows, Map<String, String[]> condition);
//    Map UserGetImage(String phone);
//
//    void DeleUser(String phone);
//
//    void UpdateUser(User user);
}
