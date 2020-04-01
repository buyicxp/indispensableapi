package com.buyi.indispensable.entity;


import java.sql.Timestamp;

public class User {

  private long uId;
  private String uname;
  private String uphone;
  private long urecommend;
  private double ubrokerage;
  private java.sql.Timestamp utime;
  private String ubank;

    public String getUbank() {
        return ubank;
    }

    public void setUbank(String ubank) {
        this.ubank = ubank;
    }

    public long getuId() {
        return uId;
    }

    public void setuId(long uId) {
        this.uId = uId;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUphone() {
        return uphone;
    }

    public void setUphone(String uphone) {
        this.uphone = uphone;
    }

    public long getUrecommend() {
        return urecommend;
    }

    public void setUrecommend(long urecommend) {
        this.urecommend = urecommend;
    }

    public double getUbrokerage() {
        return ubrokerage;
    }

    public void setUbrokerage(double ubrokerage) {
        this.ubrokerage = ubrokerage;
    }

    public Timestamp getUtime() {
        return utime;
    }

    public void setUtime(Timestamp utime) {
        this.utime = utime;
    }
}
