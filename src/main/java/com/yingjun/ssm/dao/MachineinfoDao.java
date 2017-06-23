package com.yingjun.ssm.dao;

import java.util.List;

import com.yingjun.ssm.entity.Machineinfo;

public interface MachineinfoDao {
    int deleteByPrimaryKey(Long machineinfoid);

    int insert(Machineinfo record);

    int insertSelective(Machineinfo record);

    Machineinfo selectByPrimaryKey(Long machineinfoid);

    int updateByPrimaryKeySelective(Machineinfo record);

    int updateByPrimaryKey(Machineinfo record);
    
    List<Machineinfo> queryByCondition();
    
    Machineinfo queryByMachineType(String deviceType);
    
    List<String> queryAllDeviceType();
    
    List<Machineinfo> countCardNumberOfMachine();
    
    Integer countTotalCardNumber();
}