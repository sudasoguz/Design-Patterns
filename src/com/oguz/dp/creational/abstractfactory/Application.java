package com.oguz.dp.creational.abstractfactory;

public class Application {

    private IButton button;
    private ICheckbox checkbox;

    public Application(IGUIFactory factory){
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint(){
        button.paint();
        checkbox.paint();
    }

}
