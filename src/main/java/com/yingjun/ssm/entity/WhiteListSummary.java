package com.yingjun.ssm.entity;

import java.io.Serializable;

/**
 * @author 
 */
public class WhiteListSummary implements Serializable{
    //交易类型
    private String transtype;

    //总金额
    private Integer totalnum;

    //总笔数
    private Integer totalsum;
   
    //行业类型
    private String industrycode;

    //单位代码
    private String unitid;

    //商户代码
    private String shopno;

    //单位名称
    private String unitName;

    private static final long serialVersionUID = 1L;

	public String getTranstype() {
		return transtype;
	}

	public void setTranstype(String transtype) {
		this.transtype = transtype;
	}

	public Integer getTotalnum() {
		return totalnum;
	}

	public void setTotalnum(Integer totalnum) {
		this.totalnum = totalnum;
	}

	public Integer getTotalsum() {
		return totalsum;
	}

	public void setTotalsum(Integer totalsum) {
		this.totalsum = totalsum;
	}

	public String getIndustrycode() {
		return industrycode;
	}

	public void setIndustrycode(String industrycode) {
		this.industrycode = industrycode;
	}

	public String getUnitid() {
		return unitid;
	}

	public void setUnitid(String unitid) {
		this.unitid = unitid;
	}

	public String getShopno() {
		return shopno;
	}

	public void setShopno(String shopno) {
		this.shopno = shopno;
	}

	public String getUnitName() {
		return unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

}