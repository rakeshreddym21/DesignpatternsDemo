package com.designpatterns.strategy;

public class Context {
    private Strategy strategy;
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    public void setStrategy(Strategy strategy){
        this.strategy=strategy;
    }
 public void executeStrategy(int num1,int num2){
     System.out.println(strategy.doCalculation(num1,num2));
 }

}
