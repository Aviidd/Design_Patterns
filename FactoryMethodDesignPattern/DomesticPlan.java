package FactoryMethodDesignPattern;

public class DomesticPlan extends Plan{

    @Override
    void getRate() {
        this.rate = 3;
        System.out.println("Rate updated to" + this.rate);
    }
}
