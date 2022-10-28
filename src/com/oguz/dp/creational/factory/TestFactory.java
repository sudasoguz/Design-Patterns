package com.oguz.dp.creational.factory;

public class TestFactory {

  public static void main(String[] args) {

    Computer pc = ComputerFactory.getComputer("pc", "16 GB", "1 TB", "3.6 GHZ");
    Computer server = ComputerFactory.getComputer("server", "8 GB", "2 TB", "2.4 GHZ");

    System.out.println("PC : " + pc);
    System.out.println("Server : " + server);

  }
}
