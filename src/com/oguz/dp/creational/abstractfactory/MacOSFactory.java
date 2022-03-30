package com.oguz.dp.creational.abstractfactory;

public class MacOSFactory implements IGUIFactory{

    @Override
    public IButton createButton() {
        return new MacOSButton();
    }

    @Override
    public ICheckbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
