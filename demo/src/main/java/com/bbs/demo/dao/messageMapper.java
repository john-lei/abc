package com.bbs.demo.dao;

import com.bbs.demo.bean.message;
import com.bbs.demo.bean.messageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface messageMapper {
    long countByExample(messageExample example);

    int deleteByExample(messageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(message record);

    int insertSelective(message record);

    List<message> selectByExample(messageExample example);

    message selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") message record, @Param("example") messageExample example);

    int updateByExample(@Param("record") message record, @Param("example") messageExample example);

    int updateByPrimaryKeySelective(message record);

    int updateByPrimaryKey(message record);
}