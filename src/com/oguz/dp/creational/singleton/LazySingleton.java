package com.oguz.dp.creational.singleton;

public class LazySingleton {
  private static LazySingleton lazySingleton;
  private static int count;
  private String name;

  private LazySingleton() {
    count++;
    name = "Lazy Singleton : " + count;
  }

  public static LazySingleton getInstance() {
    if (lazySingleton == null)
      lazySingleton = new LazySingleton();
    return lazySingleton;
  }

  public void printName() {
    System.out.println(name);
  }
}
