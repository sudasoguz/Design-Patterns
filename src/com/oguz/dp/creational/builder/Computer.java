package com.oguz.dp.creational.builder;

public class Computer {

  private String RAM;
  private String HDD;
  private String CPU;

  public Computer(String RAM, String HDD, String CPU) {
    this.RAM = RAM;
    this.HDD = HDD;
    this.CPU = CPU;
  }

  public Computer() {
  }

  public String getRAM() {
    return RAM;
  }

  public void setRAM(String RAM) {
    this.RAM = RAM;
  }

  public String getHDD() {
    return HDD;
  }

  public void setHDD(String HDD) {
    this.HDD = HDD;
  }

  public String getCPU() {
    return CPU;
  }

  public void setCPU(String CPU) {
    this.CPU = CPU;
  }

  @Override
  public String toString() {
    return "Computer{" +
        "RAM='" + RAM + '\'' +
        ", HDD='" + HDD + '\'' +
        ", CPU='" + CPU + '\'' +
        '}';
  }
}
