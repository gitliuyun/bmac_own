package com.yingjun.ssm.entity;

import java.io.Serializable;

/**
 * @author 
 */
public class Dictshopcodetb implements Serializable {
    private Long dictshopcodetbId;

    private String shopno;

    private String shopname;

    private String rsvd;

    private static final long serialVersionUID = 1L;

    public Long getDictshopcodetbId() {
        return dictshopcodetbId;
    }

    public void setDictshopcodetbId(Long dictshopcodetbId) {
        this.dictshopcodetbId = dictshopcodetbId;
    }

    public String getShopno() {
        return shopno;
    }

    public void setShopno(String shopno) {
        this.shopno = shopno;
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname;
    }

    public String getRsvd() {
        return rsvd;
    }

    public void setRsvd(String rsvd) {
        this.rsvd = rsvd;
    }
}