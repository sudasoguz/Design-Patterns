package com.oguz.dp.creational.singleton.singleton;

public class BillPughSingleton {
    private static int count;
    private String name;

    private BillPughSingleton(){
        count++;
        name = "Bill pugh singleton : " + count;
    }

    public void printName(){
        System.out.println(name);
    }

    private static class BillPughSingletonHelper{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance(){
        return BillPughSingletonHelper.INSTANCE;
    }
}
