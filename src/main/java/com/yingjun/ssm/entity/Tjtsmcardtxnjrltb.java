package com.yingjun.ssm.entity;

import java.io.Serializable;

/**
 * @author 
 */
public class Tjtsmcardtxnjrltb implements Serializable,Cloneable {
    private Long tjtsmcardtxnjrltbId;

    private String fileid;

    private String fileno;

    private String unitno;

    private String filever;

    private String birthdate;

    private String cardno;

    private String cardtype;

    private String transdate;

    private String transtype;

    private Integer totalnum;

    private Integer totalsum;

    private String industrycode;

    private String unitid;

    private String shopno;

    private String kktype;

    private String unitcode;

    private String mobileno;

    private String productcompany;

    private String productmodel;

    private String rsvd;

    private static final long serialVersionUID = 1L;

    public Long getTjtsmcardtxnjrltbId() {
        return tjtsmcardtxnjrltbId;
    }

    public void setTjtsmcardtxnjrltbId(Long tjtsmcardtxnjrltbId) {
        this.tjtsmcardtxnjrltbId = tjtsmcardtxnjrltbId;
    }

    public String getFileid() {
        return fileid;
    }

    public void setFileid(String fileid) {
        this.fileid = fileid;
    }

    public String getFileno() {
        return fileno;
    }

    public void setFileno(String fileno) {
        this.fileno = fileno;
    }

    public String getUnitno() {
        return unitno;
    }

    public void setUnitno(String unitno) {
        this.unitno = unitno;
    }

    public String getFilever() {
        return filever;
    }

    public void setFilever(String filever) {
        this.filever = filever;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    public String getCardtype() {
        return cardtype;
    }

    public void setCardtype(String cardtype) {
        this.cardtype = cardtype;
    }

    public String getTransdate() {
        return transdate;
    }

    public void setTransdate(String transdate) {
        this.transdate = transdate;
    }

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

    public String getKktype() {
        return kktype;
    }

    public void setKktype(String kktype) {
        this.kktype = kktype;
    }

    public String getUnitcode() {
        return unitcode;
    }

    public void setUnitcode(String unitcode) {
        this.unitcode = unitcode;
    }

    public String getMobileno() {
        return mobileno;
    }

    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }

    public String getProductcompany() {
        return productcompany;
    }

    public void setProductcompany(String productcompany) {
        this.productcompany = productcompany;
    }

    public String getProductmodel() {
        return productmodel;
    }

    public void setProductmodel(String productmodel) {
        this.productmodel = productmodel;
    }

    public String getRsvd() {
        return rsvd;
    }

    public void setRsvd(String rsvd) {
        this.rsvd = rsvd;
    }
    
    @Override  
    public Object clone() throws CloneNotSupportedException{  
        return (Tjtsmcardtxnjrltb)super.clone();  
    }
}