package com.yingjun.ssm.dao;

import com.yingjun.ssm.entity.Dicttsmunitcodetb;

public interface DicttsmunitcodetbDao {
    int deleteByPrimaryKey(Long dicttsmunitcodetbId);

    int insert(Dicttsmunitcodetb record);

    int insertSelective(Dicttsmunitcodetb record);

    Dicttsmunitcodetb selectByPrimaryKey(Long dicttsmunitcodetbId);

    int updateByPrimaryKeySelective(Dicttsmunitcodetb record);

    int updateByPrimaryKey(Dicttsmunitcodetb record);
}