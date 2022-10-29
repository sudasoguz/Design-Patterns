package com.oguz.dp.creational.prototype;

public class Test {

  public static void main(String[] args) {
    Account normalAccountPrototype = new Account("1",1000,1000,new Customer("oguz"), true,true,true);

    Account normalDefaultPrototype = normalAccountPrototype.clone();
    normalDefaultPrototype.setIban("2");
    normalDefaultPrototype.setCustomer(new Customer("John"));
    normalDefaultPrototype.setBalance(10000);
    normalDefaultPrototype.setCredit(200000);


    Account frozenDefaultPrototype = normalAccountPrototype.clone();
    frozenDefaultPrototype.setCustomer(new Customer("Chris"));
    frozenDefaultPrototype.setBalance(-2000);
    frozenDefaultPrototype.setCredit(-10000);
    frozenDefaultPrototype.setOpenToTransfer(false);
    frozenDefaultPrototype.setOpenToWithdraw(false);
    frozenDefaultPrototype.setOpenToPayment(false);

    Account negativeDefaultPrototype = normalAccountPrototype.clone();
    negativeDefaultPrototype.setCustomer(new Customer("Anna"));
    negativeDefaultPrototype.setCredit(-100);
    negativeDefaultPrototype.setBalance(-200);
    negativeDefaultPrototype.setOpenToPayment(false);
    negativeDefaultPrototype.setOpenToTransfer(false);
    negativeDefaultPrototype.setOpenToWithdraw(false);


  }
}
