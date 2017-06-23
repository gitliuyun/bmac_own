package com.yingjun.ssm.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class Machineinfo implements Serializable {
    private Long machineinfoid;

    private String devicetype;

    private String devicecompany;

    private Date recordtime;

    private Integer cardnumber;

    private Integer busnumber;

    private Integer subwaynumber;

    private String usedinotherindustry;

    private String hascomplain;

    private String isformal;

    private String resv;

    private static final long serialVersionUID = 1L;

    public Long getMachineinfoid() {
        return machineinfoid;
    }

    public void setMachineinfoid(Long machineinfoid) {
        this.machineinfoid = machineinfoid;
    }

    public String getDevicetype() {
        return devicetype;
    }

    public void setDevicetype(String devicetype) {
        this.devicetype = devicetype;
    }

    public String getDevicecompany() {
        return devicecompany;
    }

    public void setDevicecompany(String devicecompany) {
        this.devicecompany = devicecompany;
    }

    public Date getRecordtime() {
        return recordtime;
    }

    public void setRecordtime(Date recordtime) {
        this.recordtime = recordtime;
    }

    public Integer getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(Integer cardnumber) {
        this.cardnumber = cardnumber;
    }

    public Integer getBusnumber() {
        return busnumber;
    }

    public void setBusnumber(Integer busnumber) {
        this.busnumber = busnumber;
    }

    public Integer getSubwaynumber() {
        return subwaynumber;
    }

    public void setSubwaynumber(Integer subwaynumber) {
        this.subwaynumber = subwaynumber;
    }

    public String getUsedinotherindustry() {
        return usedinotherindustry;
    }

    public void setUsedinotherindustry(String usedinotherindustry) {
        this.usedinotherindustry = usedinotherindustry;
    }

    public String getHascomplain() {
        return hascomplain;
    }

    public void setHascomplain(String hascomplain) {
        this.hascomplain = hascomplain;
    }

    public String getIsformal() {
        return isformal;
    }

    public void setIsformal(String isformal) {
        this.isformal = isformal;
    }

    public String getResv() {
        return resv;
    }

    public void setResv(String resv) {
        this.resv = resv;
    }
}