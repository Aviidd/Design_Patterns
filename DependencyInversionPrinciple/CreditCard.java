package DependencyInversionPrinciple;

public class CreditCard implements Bankcard {
    public void doTransaction(long amount){
        System.out.println("payment using credit card");
    }
}
