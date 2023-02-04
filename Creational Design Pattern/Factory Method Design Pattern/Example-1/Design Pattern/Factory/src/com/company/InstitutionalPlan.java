package com.company;

public class InstitutionalPlan extends Plan{

    public void getRate() {
        this.rate = 5;
        System.out.println("rate updated to" + this.rate);
    }

}
