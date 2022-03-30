package com.oguz.dp.creational.abstractfactory;

public class MacOSButton implements IButton{

    @Override
    public void paint() {
        System.out.println("You have created MacOSButton");
    }
}
