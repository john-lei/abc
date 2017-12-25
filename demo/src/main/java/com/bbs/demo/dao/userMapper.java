package com.bbs.demo.dao;

import com.bbs.demo.bean.user;
import com.bbs.demo.bean.userExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface userMapper {
    long countByExample(userExample example);

    int deleteByExample(userExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(user record);

    int insertSelective(user record);

    List<user> selectByExample(userExample example);

    user selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") user record, @Param("example") userExample example);

    int updateByExample(@Param("record") user record, @Param("example") userExample example);

    int updateByPrimaryKeySelective(user record);

    int updateByPrimaryKey(user record);

    int insertByRegister(user myUser);

    user selectByUsernameAndPassword(user myUser);

    user selectByUsername(user myUser);

    public List<user> selectloguser(String name);
}