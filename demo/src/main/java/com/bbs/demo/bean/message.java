package com.bbs.demo.bean;

public class message {
    private Integer id;

    private Integer sendid;

    private String title;

    private Integer state;

    private Integer receiveId;

    private String msgCreateDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSendid() {
        return sendid;
    }

    public void setSendid(Integer sendid) {
        this.sendid = sendid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getReceiveId() {
        return receiveId;
    }

    public void setReceiveId(Integer receiveId) {
        this.receiveId = receiveId;
    }

    public String getMsgCreateDate() {
        return msgCreateDate;
    }

    public void setMsgCreateDate(String msgCreateDate) {
        this.msgCreateDate = msgCreateDate == null ? null : msgCreateDate.trim();
    }
}