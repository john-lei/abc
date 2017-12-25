package com.bbs.demo.service;

import com.bbs.demo.bean.user;

import java.util.List;

public interface UserService {

    //添加用户
    void addUser(user user);
    //查找用户
    user checkUser(user user);
    //查找用户名
    user checkUsername(user user);

    // 把不是自己的用户查询出来
    public List<user> loguser(String name);
}
