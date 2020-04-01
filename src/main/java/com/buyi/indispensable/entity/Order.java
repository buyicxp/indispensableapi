package com.buyi.indispensable.entity;


import java.sql.Timestamp;

public class Order {

  private long oId;
  private long uId;
  private long tId;
  private long oState;
  private java.sql.Timestamp oTime;

  public long getoId() {
    return oId;
  }

  public void setoId(long oId) {
    this.oId = oId;
  }

  public long getuId() {
    return uId;
  }

  public void setuId(long uId) {
    this.uId = uId;
  }

  public long gettId() {
    return tId;
  }

  public void settId(long tId) {
    this.tId = tId;
  }

  public long getoState() {
    return oState;
  }

  public void setoState(long oState) {
    this.oState = oState;
  }

  public Timestamp getoTime() {
    return oTime;
  }

  public void setoTime(Timestamp oTime) {
    this.oTime = oTime;
  }
}
