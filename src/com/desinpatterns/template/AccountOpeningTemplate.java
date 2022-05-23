package com.desinpatterns.template;

public abstract class AccountOpeningTemplate {
    public abstract void provideId();
    public boolean isPremium;
    public abstract void depositAmt();
    public final void premiumServices(){
        System.out.println("Added additional Benefits");
    }
    public abstract void delivery();
    public final void processAccount(Boolean isPremium){
        provideId();
        depositAmt();
        if(isPremium){
            premiumServices();
        }
        delivery();
    }
}
