package com.yingjun.ssm.entity;

import java.io.Serializable;

/**
 * @author 
 */
public class Dictbmacunitcodetb implements Serializable {
    private Long dictbmacunitcodetbId;

    private String unitid;

    private String unitname;

    private String rsvd;

    private static final long serialVersionUID = 1L;

    public Long getDictbmacunitcodetbId() {
        return dictbmacunitcodetbId;
    }

    public void setDictbmacunitcodetbId(Long dictbmacunitcodetbId) {
        this.dictbmacunitcodetbId = dictbmacunitcodetbId;
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