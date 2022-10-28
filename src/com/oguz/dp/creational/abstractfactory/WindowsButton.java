package com.oguz.dp.creational.abstractfactory;

public class WindowsButton implements IButton {

  @Override
  public void paint() {
    System.out.println("You have created WindowsButton");
  }
}
