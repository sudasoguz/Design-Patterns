package com.oguz.dp.creational.singleton;

public class SingletonPrinterClient {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            SingletonPrinter printer = SingletonPrinter.getInstance();
            printer.printName();
        }

        SingletonPrinter printer1 = SingletonPrinter.getInstance();
        System.out.println("HashCode : " + printer1.hashCode());
        SingletonPrinter printer2 = SingletonPrinter.getInstance();
        System.out.println("HashCode : " + printer2.hashCode());
        SingletonPrinter printer3 = SingletonPrinter.getInstance();
        System.out.println("HashCode : " + printer3.hashCode());
    }
}
