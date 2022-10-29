package com.oguz.dp.creational.prototype;

public class Account implements Cloneable{

  protected String iban;
  protected double balance;
  protected double credit;
  protected Customer customer;

  private boolean openToWithdraw;
  private boolean openToPayment;
  private boolean openToTransfer;

  public Account(String iban, double balance, double credit, Customer customer, boolean openToWithdraw, boolean openToPayment, boolean openToTransfer) {
    this.iban = iban;
    this.balance = balance;
    this.credit = credit;
    this.customer = customer;
    this.openToWithdraw = openToWithdraw;
    this.openToPayment = openToPayment;
    this.openToTransfer = openToTransfer;
  }

  public String getIban() {
    return iban;
  }

  public void setIban(String iban) {
    this.iban = iban;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public double getCredit() {
    return credit;
  }

  public void setCredit(double credit) {
    this.credit = credit;
  }

  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  public boolean isOpenToWithdraw() {
    return openToWithdraw;
  }

  public void setOpenToWithdraw(boolean openToWithdraw) {
    this.openToWithdraw = openToWithdraw;
  }

  public boolean isOpenToPayment() {
    return openToPayment;
  }

  public void setOpenToPayment(boolean openToPayment) {
    this.openToPayment = openToPayment;
  }

  public boolean isOpenToTransfer() {
    return openToTransfer;
  }

  public void setOpenToTransfer(boolean openToTransfer) {
    this.openToTransfer = openToTransfer;
  }


  @Override
  public Account clone() {
    Account clone = null;
    try {
      clone = (Account) super.clone();
    } catch (CloneNotSupportedException e) {
      throw new AssertionError();
    }
    return clone;
  }
}
