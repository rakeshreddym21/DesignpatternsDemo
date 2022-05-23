package com.designpatterns.state;

class StatePattern {
    public static void main(String[] args) {
        AlertStateContext stateContext = new AlertStateContext();
        stateContext.alert();
        stateContext.alert();
        stateContext.setState(new AeroplaneMode());
        stateContext.alert();
        stateContext.setState(new DNB());
        stateContext.alert();
        stateContext.alert();
    }
}
