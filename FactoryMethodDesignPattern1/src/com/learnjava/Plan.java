package com.learnjava;

abstract class Plan {
    protected double rate;
    abstract void getRate();

    public void CalculateBill(int units) {
        System.out.println("Value of rate is " + this.rate);
        System.out.println("Total Bill is" + (units*rate));

    }
}
