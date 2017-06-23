package com.yingjun.ssm.dao;

import java.util.List;

import com.yingjun.ssm.entity.Tjtsmcardtxnjrltb;
import com.yingjun.ssm.entity.WhiteListSummary;

public interface TjtsmcardtxnjrltbDao {
    int deleteByPrimaryKey(Long tjtsmcardtxnjrltbId);

    int insert(Tjtsmcardtxnjrltb record);
    
    int batchInsert(List<Tjtsmcardtxnjrltb> list);

    int insertSelective(Tjtsmcardtxnjrltb record);

    Tjtsmcardtxnjrltb selectByPrimaryKey(Long tjtsmcardtxnjrltbId);

    int updateByPrimaryKeySelective(Tjtsmcardtxnjrltb record);

    int updateByPrimaryKey(Tjtsmcardtxnjrltb record);
    
    List<Tjtsmcardtxnjrltb> queryByCondition();
    
    /**
     * 查询某种机型开卡数量
     * @param machineType
     * @return
     */
    int countOpenCardNo(String machineType);
    
    /**
     * 查询在用公交/地铁条数
     * @param machineType
     * @param industryNo
     * @return
     */
    int countIndustryNo(String machineType, String industryNo);
    
    /**
     * 获取机型详情
     * @param deviceType
     * @return
     */
    List<WhiteListSummary> getDeviceDetail(String deviceType);
    
    /**
     * 查询已经导入的文件名称列表
     * @return
     */
    List<String> queryExistFileIds();
    /**
     * 查询指定日志文件汇总信息
     * @param fileId
     * @return
     */
    Tjtsmcardtxnjrltb queryByFileIdGroup(String fileId);
    
    List<Tjtsmcardtxnjrltb> queryByFileIds(List<String> fileIds);
    
    void updateByCardNo(Tjtsmcardtxnjrltb update);
}