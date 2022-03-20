package com.oguz.dp.creational.singleton.singleton;

public class LazySingletonClient {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++){
            LazySingleton lazySingleton = LazySingleton.getInstance();
            lazySingleton.printName();
        }

    }
}
