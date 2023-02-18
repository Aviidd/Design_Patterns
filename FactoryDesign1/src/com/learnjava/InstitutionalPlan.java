package com.learnjava;

public class InstitutionalPlan extends Plan{
    @Override
    public void getRate(){
        amount = 5;
//        System.out.println("rate updated to" + this.amount);
    }
}
