package com.yingjun.ssm.entity;

import java.io.Serializable;

/**
 * @author 
 */
public class Mngusertb implements Serializable {
    private Long mngusertbId;

    private String systemid;

    private String userid;

    private String username;

    private String password;

    private Integer garde;

    private Integer stat;

    private String rsvd;

    private static final long serialVersionUID = 1L;

    public Long getMngusertbId() {
        return mngusertbId;
    }

    public void setMngusertbId(Long mngusertbId) {
        this.mngusertbId = mngusertbId;
    }

    public String getSystemid() {
        return systemid;
    }

    public void setSystemid(String systemid) {
        this.systemid = systemid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getGarde() {
        return garde;
    }

    public void setGarde(Integer garde) {
        this.garde = garde;
    }

    public Integer getStat() {
        return stat;
    }

    public void setStat(Integer stat) {
        this.stat = stat;
    }

    public String getRsvd() {
        return rsvd;
    }

    public void setRsvd(String rsvd) {
        this.rsvd = rsvd;
    }
}