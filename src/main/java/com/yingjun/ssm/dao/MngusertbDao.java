package com.yingjun.ssm.dao;

import com.yingjun.ssm.entity.Mngusertb;

public interface MngusertbDao {
    int deleteByPrimaryKey(Long mngusertbId);

    int insert(Mngusertb record);

    int insertSelective(Mngusertb record);

    Mngusertb selectByPrimaryKey(Long mngusertbId);

    int updateByPrimaryKeySelective(Mngusertb record);

    int updateByPrimaryKey(Mngusertb record);
    
    int queryByUserName(String userName, String password);
}