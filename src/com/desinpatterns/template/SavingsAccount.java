package com.desinpatterns.template;

public class SavingsAccount extends AccountOpeningTemplate{
    @Override
    public void provideId() {
        System.out.println("Provided Id");
    }

    @Override
    public void depositAmt() {
        System.out.println("Deposited min amt required for account opening");

    }

    @Override
    public void delivery() {
        System.out.println("Delivered handbook,chequebook and debit card");
    }
}
