package com.bbs.demo.service.Impl;

import com.bbs.demo.bean.user;
import com.bbs.demo.dao.userMapper;
import com.bbs.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    userMapper userMapper;

    @Override
    public void addUser(user user) {
        userMapper.insertByRegister(user);
    }

    @Override
    public user checkUser(user user) {
        return userMapper.selectByUsernameAndPassword(user);
    }

    @Override
    public user checkUsername(user user) {
        return userMapper.selectByUsername(user);
    }

    @Override
    public List<user> loguser(String name) {
        return userMapper.selectloguser(name);
    }
}
