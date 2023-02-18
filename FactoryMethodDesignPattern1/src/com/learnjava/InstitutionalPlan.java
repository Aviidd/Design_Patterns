package com.learnjava;

public class InstitutionalPlan extends Plan{
    @Override
    void getRate() {
        this.rate = 5;
        System.out.println("Rate updated to:" + this.rate);
    }
}
