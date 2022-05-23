package com.designpatterns.state;


class NormalMode implements AlertState
{
    @Override
    public void alert(AlertStateContext ctx)
    {
        System.out.println("Normal Mode...All Notifications are allowed");
    }

}

