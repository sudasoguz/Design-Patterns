package com.oguz.dp.creational.singleton.enumeration;

import java.io.Serializable;

public enum EnumSingleton implements Serializable {

  SINGLETON;

  private EnumSingleton() {
    System.out.println("in EnumSingleton() ");
  }

  public static EnumSingleton getInstance() {
    return SINGLETON;
  }
}
