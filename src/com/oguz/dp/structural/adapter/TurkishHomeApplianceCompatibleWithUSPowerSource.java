package com.oguz.dp.structural.adapter;

public class TurkishHomeApplianceCompatibleWithUSPowerSource extends TurkishHomeAppliance{
  private USPowerSource usPowerSource;
  private boolean turkishPowerSource;

  public TurkishHomeApplianceCompatibleWithUSPowerSource(String name) {
    super(name);
  }

  @Override
  public void setPowerSource(TurkishPowerSource powerSource) {
    this.powerSource = powerSource;
    turkishPowerSource = true;
  }

  public void setPowerSource(USPowerSource usPowerSource){
    this.usPowerSource = usPowerSource;
    turkishPowerSource = false;
  }

  @Override
  public void start() {
    System.out.println("TurkishHomeApplience " + name + " is starting!");
    if (turkishPowerSource)
      powerSource.turnOn();
    else
      usPowerSource.pushSwitch();
  }

  @Override
  public void stop() {
    System.out.println("TurkishHomeAppliance " + name + " stoping!");
    if (turkishPowerSource)
      powerSource.turnOff();
    else
      usPowerSource.pushSwitch();
  }
}
