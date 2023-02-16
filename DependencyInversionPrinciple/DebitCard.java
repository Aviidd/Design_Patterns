package DependencyInversionPrinciple;

public class DebitCard implements Bankcard {
    public void doTransaction(long amount){
        System.out.println("payment using Debit card");
    }
}
