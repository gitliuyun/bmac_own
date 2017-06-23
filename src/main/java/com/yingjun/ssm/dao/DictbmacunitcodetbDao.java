package com.yingjun.ssm.dao;

import java.util.List;

import com.yingjun.ssm.entity.Dictbmacunitcodetb;

public interface DictbmacunitcodetbDao {
    int deleteByPrimaryKey(Long dictbmacunitcodetbId);

    int insert(Dictbmacunitcodetb record);

    int insertSelective(Dictbmacunitcodetb record);

    Dictbmacunitcodetb selectByPrimaryKey(Long dictbmacunitcodetbId);

    int updateByPrimaryKeySelective(Dictbmacunitcodetb record);

    int updateByPrimaryKey(Dictbmacunitcodetb record);
    
    List<Dictbmacunitcodetb> queryByCondition();
    /**
     * 查询已经存在的单位代码
     * @return
     */
    List<String> queryExistUnitId();
}