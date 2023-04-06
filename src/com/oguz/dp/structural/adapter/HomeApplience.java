package com.oguz.dp.structural.adapter;

public abstract class HomeApplience implements Appliance{

  protected TurkishPowerSource powerSource;

  @Override
  public void setPowerSource(TurkishPowerSource powerSource) {
    this.powerSource = powerSource;
  }
}
