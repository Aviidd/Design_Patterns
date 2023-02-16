package SingleResponsibilityPrinciple;

public class BankService {
    private long amount;
    private String AccountNo;
    private String Loantype;
    private int otp;

    public BankService(long amount, String AccountNo, String Loantype, int otp){
        this.amount = amount; // constructor
        this.AccountNo = AccountNo;
        this.Loantype = Loantype;
        this.otp = otp;
    }
    // in this class we give acess to the clients that can deposit and withdraw the amount from the atm
    public long deposit(long amount, String AccountNo){
        // perform some action
        return 0;
    }
    public long Withdraw(long amount, String AccountNo){
        // perform some action
        return 0;
    }

    public static void main(String[] args) {

    }

}
