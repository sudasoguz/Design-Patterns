package com.oguz.dp.creational.abstractfactory;

public interface IGUIFactory {

  IButton createButton();

  ICheckbox createCheckbox();
}
