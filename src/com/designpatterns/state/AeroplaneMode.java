package com.designpatterns.state;

class AeroplaneMode implements AlertState {
    @Override
    public void alert(AlertStateContext ctx) {
        System.out.println("In Aeroplane Mode...NO Notifications are allowed" );
    }

}
