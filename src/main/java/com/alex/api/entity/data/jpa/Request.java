package com.alex.api.entity.data.jpa;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import javax.persistence.*;

/**
 * Created by alexchen on 2017/1/12.
 */
@Entity
@Table
@XStreamAlias("request")
public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @XStreamAlias("appId")
    private String appId;
    @XStreamAlias("callId")
    private String callId;
    @XStreamAlias("accountSid")
    private String accountSid;
    @XStreamAlias("subAccountSid")
    private String subAccountSid;
    @XStreamAlias("caller")
    private Long caller;
    @XStreamAlias("called")
    private Long called;
    @XStreamAlias("state")
    private Integer state =0;
    @XStreamAlias("starttime")
    private String starttime;
    @XStreamAlias("endtime")
    private String endtime;
    @XStreamAlias("duration")
    private Integer duration;
    @XStreamAlias("userData")
    private String userData;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getCallId() {
        return callId;
    }

    public void setCallId(String callId) {
        this.callId = callId;
    }

    public String getAccountSid() {
        return accountSid;
    }

    public void setAccountSid(String accountSid) {
        this.accountSid = accountSid;
    }

    public String getSubAccountSid() {
        return subAccountSid;
    }

    public void setSubAccountSid(String subAccountSid) {
        this.subAccountSid = subAccountSid;
    }

    public Long getCaller() {
        return caller;
    }

    public void setCaller(Long caller) {
        this.caller = caller;
    }

    public Long getCalled() {
        return called;
    }

    public void setCalled(Long called) {
        this.called = called;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getUserData() {
        return userData;
    }

    public void setUserData(String userData) {
        this.userData = userData;
    }
}
