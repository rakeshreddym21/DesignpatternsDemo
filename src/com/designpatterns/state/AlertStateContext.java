package com.designpatterns.state;

class AlertStateContext {
    private AlertState currentState;

    public AlertStateContext() {
        currentState = new NormalMode();
    }

    public void setState(AlertState state) {
        currentState = state;
    }

    public void alert() {
        currentState.alert(this);
    }
}
