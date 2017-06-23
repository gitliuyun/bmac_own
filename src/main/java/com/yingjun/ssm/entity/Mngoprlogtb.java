package com.yingjun.ssm.entity;

import java.io.Serializable;

/**
 * @author 
 */
public class Mngoprlogtb implements Serializable {
    private Long mngoprlogtbId;

    private Integer logseq;

    private String logtest;

    private String userid;

    private String sessionid;

    private String funcid;

    private String funcname;

    private String opertype;

    private String begtime;

    private String endtime;

    private String status;

    private String rsvd;

    private static final long serialVersionUID = 1L;

    public Long getMngoprlogtbId() {
        return mngoprlogtbId;
    }

    public void setMngoprlogtbId(Long mngoprlogtbId) {
        this.mngoprlogtbId = mngoprlogtbId;
    }

    public Integer getLogseq() {
        return logseq;
    }

    public void setLogseq(Integer logseq) {
        this.logseq = logseq;
    }

    public String getLogtest() {
        return logtest;
    }

    public void setLogtest(String logtest) {
        this.logtest = logtest;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getSessionid() {
        return sessionid;
    }

    public void setSessionid(String sessionid) {
        this.sessionid = sessionid;
    }

    public String getFuncid() {
        return funcid;
    }

    public void setFuncid(String funcid) {
        this.funcid = funcid;
    }

    public String getFuncname() {
        return funcname;
    }

    public void setFuncname(String funcname) {
        this.funcname = funcname;
    }

    public String getOpertype() {
        return opertype;
    }

    public void setOpertype(String opertype) {
        this.opertype = opertype;
    }

    public String getBegtime() {
        return begtime;
    }

    public void setBegtime(String begtime) {
        this.begtime = begtime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRsvd() {
        return rsvd;
    }

    public void setRsvd(String rsvd) {
        this.rsvd = rsvd;
    }
}