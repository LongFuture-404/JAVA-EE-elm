package com.example.java_ee.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class User {
    private String userId;
    private String userName;
    private String avatar;
    private Integer userSex;
    private String password;

//    private List<permissions> priList ;

    public User(String userId, String password, String userName, Integer userSex) {
        this.userId = userId;
        this.userName = userName;
        this.userSex = userSex;
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserSex() {
        return userSex;
    }

    public void setUserSex(Integer userSex) {
        this.userSex = userSex;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

//    public List<permissions> getPriList() {
//        return priList;
//    }
//
//    public void setPriList(List<permissions> priList) {
//        this.priList = priList;
//    }

    @Override
    public String toString() {
        return "Users{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", avatar='" + avatar + '\'' +
                ", userSex=" + userSex +
                ", password='" + password + '\'' +
//                ", priList=" + priList +
                '}';
    }
}
