package com.example.java_ee.service.Impl;

import com.example.java_ee.dao.UserDao;
import com.example.java_ee.entity.User;
import com.example.java_ee.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userServiceImpl")
public class UserServiceImpl implements UserService {

    @Resource(name = "userDao")
    UserDao userdao;

    @Override
    public User UserSelect(String userId){
        return userdao.SelectSingle(userId);
    }

    @Override
    public void UserInsert(User user){
        userdao.Insert(user);
    }

//    @Override
//    public void UserUpdatePW(User user) {
//        userdao.UpdatePW(user);
//    }
//
//    @Override
//    public void UserLock(String phone) {
//        userdao.Lock(phone);
//    }
//
////    @Override
////    public List<permissions> getUserPri (Integer R_id){
////
////        List<permissions> permissions=pridao.PriSelect(R_id);
////
////        for (permissions permission:permissions){
////            Map<String, Object> paramMap=new HashMap<>();
////            paramMap. put("p_id", permission.getP_id());
////            paramMap. put("R_id", R_id);
////            List<permissions> sonPriList = pridao.UserPriSelect(paramMap);
////            permission.setPriList(sonPriList);
////        }
////
////        return permissions;
////    }
//
//    @Override
//    public Integer UserResult() {
//        return userdao.GetResult();
//    }
//
//    @Override
//    public void UserAddResult(Map<String,Object> map) {
//        userdao.SetResult(map);
//    }
//
//    @Override
//    public void RemoveResult() {
//        userdao.NoResult();
//    }
//
////    @Override
////    public PageBean<User> findUserByPage(String _currentPage, String _rows, Map<String, String[]> condition) {
////        int currentPage=Integer.parseInt(_currentPage);
////        int rows=Integer.parseInt(_rows);
////
//////        if(currentPage<=0){
//////            currentPage=1;
//////        }
////        PageBean<User> pb=new PageBean<User>();
////        pb.setCurrentPage(currentPage);
////        pb.setRows(rows);
////
////        //将Map<String, String[]>的StringBuilder转换为Map<String, Object>的String类型
////        Map<String, Object> map=new HashMap<>();
////        //将String[]类型转换为String类型
////        String temp= Arrays.toString(condition.get("name"));
////        //去除String中的[]
////        String name=temp.substring(1,temp.length()-1);
////        map.put("name",name);
////
////        int totalCount=userdao.findTotalCount(map);
////        pb.setTotalCount(totalCount);
////        int start=(currentPage-1)*rows;
////
////        List<Users> list=userdao.findByPage(start,rows,map);
////        pb.setList(list);
////
////        int totalPage=(totalCount % rows) ==0 ? totalCount/rows : totalCount/rows+1;
////        pb.setTotalPage(totalPage);
////        return pb;
////    }
//    @Override
//    public Map UserGetImage(String phone){
//        return userdao.GetImage(phone);
//    }
//
//    public void DeleUser(String phone){
//        userdao.DeleteU(phone);
//    }
//
//    public void UpdateUser(User user){
//        userdao.UpdateU(user);
//    }
}
