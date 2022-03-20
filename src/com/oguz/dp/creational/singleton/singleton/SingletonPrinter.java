package com.oguz.dp.creational.singleton.singleton;

public class SingletonPrinter {
    private static SingletonPrinter singletonPrinter = new SingletonPrinter();

    private static int count;
    private String name;

    private SingletonPrinter() {
        count++;
        name = "Printer number : " + count;
    }

    public static SingletonPrinter getInstance() {
        return singletonPrinter;
    }

    public void printName() {
        System.out.println(name);
    }
}
