package com.oguz.dp.creational.builder;

public class ComputerBuilder {

  Computer computer = new Computer();

  public ComputerBuilder withRAM(String RAM) {
    computer.setRAM(RAM);
    return this;
  }

  public ComputerBuilder withHDD(String HDD) {
    computer.setHDD(HDD);
    return this;
  }

  public ComputerBuilder withCPU(String CPU) {
    computer.setCPU(CPU);
    return this;
  }

  public Computer build() {
    return computer;
  }
}
