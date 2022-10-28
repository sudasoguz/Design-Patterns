package com.oguz.dp.creational.abstractfactory;

public class WindowsFactory implements IGUIFactory {

  @Override
  public IButton createButton() {
    return new WindowsButton();
  }

  @Override
  public ICheckbox createCheckbox() {
    return new WindowsCheckbox();
  }
}
