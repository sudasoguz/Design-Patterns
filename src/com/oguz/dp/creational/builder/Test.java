package com.oguz.dp.creational.builder;

public class Test {
  public static void main(String[] args) {
    ComputerBuilder computerBuilder = new ComputerBuilder();
    Computer computer = computerBuilder
        .withCPU("CPU")
        .withRAM("RAM")
        .withHDD("HDD")
        .build();

    System.out.println(computer.toString());
  }
}
