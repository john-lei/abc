package com.bbs.demo.bean;

public class user {
    private Integer id;

    private String userName;

    private String passWord;

    private String email;

    public user() {
    }

    public user(String userName) {
        this.userName = userName;
    }

    public user(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }

    public user(String userName, String passWord, String email) {
        this.userName = userName;
        this.passWord = passWord;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord == null ? null : passWord.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }
}