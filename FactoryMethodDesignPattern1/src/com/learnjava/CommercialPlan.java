package com.learnjava;

public class CommercialPlan extends Plan{
    @Override
    void getRate() {
        this.rate = 4;
        System.out.println("Rate updated to:" + this.rate);

    }
}
