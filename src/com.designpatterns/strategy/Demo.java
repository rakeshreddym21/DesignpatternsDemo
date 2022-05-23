package com.designpatterns.strategy;

public class Demo {
    public static void main(String[] args) {
        Context context1=new Context(new Add());
context1.executeStrategy(17,8);
context1.setStrategy(new Subtract());
context1.executeStrategy(10,3);
    }

}
