package com.yingjun.ssm.dao;

import java.util.List;

import com.yingjun.ssm.entity.Biwhiteardinfotb;

public interface BiwhiteardinfotbDao {
    int deleteByPrimaryKey(Long biwhitecardinfotbId);

    int insert(Biwhiteardinfotb record);

    int insertSelective(Biwhiteardinfotb record);

    BiwhiteardinfotbDao selectByPrimaryKey(Long biwhitecardinfotbId);

    int updateByPrimaryKeySelective(Biwhiteardinfotb record);

    int updateByPrimaryKey(Biwhiteardinfotb record);
    
    List<Biwhiteardinfotb> queryByCondition();
    
    /**
     * 查询所有卡号信息
     * @return
     */
    List<Biwhiteardinfotb> queryAllCardInfo();
    
    List<String> queryAllCardNo();
}