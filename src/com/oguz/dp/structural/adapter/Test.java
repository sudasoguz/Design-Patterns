package com.oguz.dp.structural.adapter;

public class Test {
  public static void main(String[] args) {

    TurkishPowerSource turkishPowerSource = new TurkishPowerProvider();

    TurkishHomeApplianceCompatibleWithUSPowerSource turkishMixer = new TurkishHomeApplianceCompatibleWithUSPowerSource("Mixer");
    turkishMixer.setPowerSource(turkishPowerSource);
    turkishMixer.start();
    turkishMixer.stop();

    System.out.println();

    USPowerSource usPowerSource = new UsPowerProvider();

    turkishMixer.setPowerSource(usPowerSource);
    turkishMixer.start();
    turkishMixer.stop();


  }
}
