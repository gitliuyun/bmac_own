package com.yingjun.ssm.entity;

import java.io.Serializable;

/**
 * @author 
 */
public class Dicttsmunitcodetb implements Serializable {
    private Long dicttsmunitcodetbId;

    private String unitid;

    private String unitname;

    private String rsvd;

    private static final long serialVersionUID = 1L;

    public Long getDicttsmunitcodetbId() {
        return dicttsmunitcodetbId;
    }

    public void setDicttsmunitcodetbId(Long dicttsmunitcodetbId) {
        this.dicttsmunitcodetbId = dicttsmunitcodetbId;
    }

    public String getUnitid() {
        return unitid;
    }

    public void setUnitid(String unitid) {
        this.unitid = unitid;
    }

    public String getUnitname() {
        return unitname;
    }

    public void setUnitname(String unitname) {
        this.unitname = unitname;
    }

    public String getRsvd() {
        return rsvd;
    }

    public void setRsvd(String rsvd) {
        this.rsvd = rsvd;
    }
}