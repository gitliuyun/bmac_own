package com.yingjun.ssm.entity;

import java.io.Serializable;

/**
 * @author 
 */
public class Biwhiteardinfotb implements Serializable {
    private Long biwhitecardinfotbId;

    private String cardno;

    private String kktype;

    private String unitcode;

    private String mobileno;

    private String productcompany;

    private String productmodel;

    private String rsvd;

    private static final long serialVersionUID = 1L;

    public Long getBiwhitecardinfotbId() {
        return biwhitecardinfotbId;
    }

    public void setBiwhitecardinfotbId(Long biwhitecardinfotbId) {
        this.biwhitecardinfotbId = biwhitecardinfotbId;
    }

    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno;
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
}