package com.hellochemo.bean;

public class MyBean {
    private Integer Id;
    private String uname;
    private String upass;

    public String getName() {
        return uname;
    }
    public void setName(String uname) {
        this.uname = uname;
    }

    public String getUpass() {
        return upass;
    }

    public void setUpass(String upass) {
        this.upass = upass;
    }
}
