package com.oguz.dp.creational.singleton.lazysingleton;

public class LazySingleton {
    private static LazySingleton lazySingleton;
    private static int count;
    private String name;

    private LazySingleton() {
        count++;
        System.out.println("Lazy Singleton : " + count);
    }

    public static LazySingleton getInstance() {
        if (lazySingleton == null)
            lazySingleton = new LazySingleton();
        return lazySingleton;
    }

    public void printName() {
        System.out.println(name);
    }
}
