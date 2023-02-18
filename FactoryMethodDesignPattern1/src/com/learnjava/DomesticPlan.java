package com.learnjava;

public class DomesticPlan extends Plan{
    @Override
    void getRate() {
        this.rate = 3;
        System.out.println("Rate Updated to: "+ this.rate);
    }
}
