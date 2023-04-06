package com.oguz.dp.structural.adapter;

public class UsPowerProvider implements USPowerSource {
  private boolean on;

  public UsPowerProvider(){
    System.out.println("USPowerProvider is up and running.");
  }

  @Override
  public void providePowerAt110v() {
    System.out.println("USPowerProvider provides electricity at 110V!");
  }

  @Override
  public void pushSwitch() {
    if (!on) {
      on = true;
      System.out.println("USPowerProvider started to provide electricity.");
    } else {
      on = false;
      System.out.println("USPowerProvider stopped to provide electricity.");
    }
  }
}
