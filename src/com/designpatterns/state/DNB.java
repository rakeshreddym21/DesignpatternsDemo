package com.designpatterns.state;

public class DNB implements AlertState{
    @Override
    public void alert(AlertStateContext ctx) {
        System.out.println("In DNB mode....Only Emergency Calls are allowed");
    }
}
