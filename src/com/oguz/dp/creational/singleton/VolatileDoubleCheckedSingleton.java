package com.oguz.dp.creational.singleton;

public class VolatileDoubleCheckedSingleton {
    private static volatile VolatileDoubleCheckedSingleton singleton;
    private static int count;
    private String name;

    private VolatileDoubleCheckedSingleton() {
        count++;
        name = "VolatileDoubleCheckedSingleton : " + count;
    }

    public VolatileDoubleCheckedSingleton getInstance() {
        if (singleton == null) {
            synchronized (VolatileDoubleCheckedSingleton.class) {
                if (singleton == null) {
                    singleton = new VolatileDoubleCheckedSingleton();
                }
            }
        }
        return singleton;
    }

    public void printName() {
        System.out.println(name);
    }
}
