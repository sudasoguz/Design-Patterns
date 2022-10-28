package com.oguz.dp.creational.singleton.enumeration;

public class EnumSingletonClient {

  public static void main(String[] args) {
    EnumSingleton enumSingleton = EnumSingleton.SINGLETON;
    EnumSingleton enumSingleton1 = EnumSingleton.getInstance();

    if (enumSingleton == enumSingleton1) {
      System.out.println("The same 1: " + enumSingleton.hashCode() + " 2 : " + enumSingleton1.hashCode());
    } else {
      System.out.println("Different!");
    }
  }
}
