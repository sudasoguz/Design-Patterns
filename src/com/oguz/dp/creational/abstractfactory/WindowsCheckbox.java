package com.oguz.dp.creational.abstractfactory;

public class WindowsCheckbox implements ICheckbox{

    @Override
    public void paint() {
        System.out.println("You have created WindowsCheckbox");
    }
}
