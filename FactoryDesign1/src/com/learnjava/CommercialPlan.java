package com.learnjava;

public class CommercialPlan extends Plan{
    @Override
    public void getRate(){
        amount = 4;
//        System.out.println("rate updated to" + this.amount);
    }
}
