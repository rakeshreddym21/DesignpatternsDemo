package com.desinpatterns.template;

public class Demo {
    public static void main(String[] args) {
        AccountOpeningTemplate account=new SavingsAccount();
        account.processAccount(true);
        System.out.println();
        account.processAccount(false);
    }
}
