package com.designpatterns.strategy;

public class Subtract implements Strategy{
    @Override
    public int doCalculation(int num1, int num2) {
        return num1-num2;
    }
}
