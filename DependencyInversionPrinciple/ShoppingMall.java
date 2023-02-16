package DependencyInversionPrinciple;

public class ShoppingMall {
    private Bankcard bankcard;

    public ShoppingMall(Bankcard bankcard){
        this.bankcard = bankcard;
    }
    public void doPurchaseSomething(long amount){
        bankcard.doTransaction(amount);
    }
    public static void main(String[] args){
        DebitCard debitCard = new DebitCard();
        CreditCard creditCard = new CreditCard();

        Bankcard bankcard = new CreditCard();
        // in this line we have to make the changes

        ShoppingMall shoppingMall = new ShoppingMall(creditCard);
        // in this line we have to card which is used for transaction
        shoppingMall.doPurchaseSomething(5000); // enter the amount

    }
}
