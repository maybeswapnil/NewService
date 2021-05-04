package com.hellochemo.controller;

public class Output {
    private int id;
    private String uname;
    private String upass;
    private Boolean status;

    public Output(int id, String uname, String upass, Boolean status) {
        this.id = id;
        this.uname = uname;
        this.upass = upass;
        this.status = status;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUname() {
        return uname;
    }
    public void setUname(String uname) {
        this.uname = uname;
    }
    public String getUpass() {
        return upass;
    }
    public void setUpass(String upass) {
        this.upass = upass;
    }
}
