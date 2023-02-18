package com.learnjava;

abstract class Plan {
    protected double amount;
    abstract void getRate();

    public void calculate(int units){
        System.out.println("Value of rate is" + this.amount);
        System.out.println("Total bill is " + (units * amount));
    }
}
