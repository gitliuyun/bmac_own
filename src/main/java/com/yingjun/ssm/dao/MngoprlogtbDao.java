package com.yingjun.ssm.dao;

import com.yingjun.ssm.entity.Mngoprlogtb;

public interface MngoprlogtbDao {
    int deleteByPrimaryKey(Long mngoprlogtbId);

    int insert(Mngoprlogtb record);

    int insertSelective(Mngoprlogtb record);

    Mngoprlogtb selectByPrimaryKey(Long mngoprlogtbId);

    int updateByPrimaryKeySelective(Mngoprlogtb record);

    int updateByPrimaryKey(Mngoprlogtb record);
}