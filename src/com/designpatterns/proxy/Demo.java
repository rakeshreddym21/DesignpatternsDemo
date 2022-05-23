package com.designpatterns.proxy;

public class Demo {
    public static void main(String[] args) {
        Data data=new ProxyStoreData("college-database");
        data.display();
        System.out.println("");
        data.display();
    }
}
