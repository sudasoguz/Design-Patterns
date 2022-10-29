package com.oguz.dp.creational.prototype;

public class Customer {

  private long customerId;
  private long tckn;
  private String name;
  private String surname;

  public Customer(long customerId, long tckn, String name, String surname) {
    this.customerId = customerId;
    this.tckn = tckn;
    this.name = name;
    this.surname = surname;
  }

  public Customer(String name) {
    this.name = name;
  }

  public long getCustomerId() {
    return customerId;
  }

  public void setCustomerId(long customerId) {
    this.customerId = customerId;
  }

  public long getTckn() {
    return tckn;
  }

  public void setTckn(long tckn) {
    this.tckn = tckn;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }


}
