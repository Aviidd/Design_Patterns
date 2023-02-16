package SingleResponsibilityPrinciple;

public class LoanService {
    public void GetLoanInterestInfo(String loantype){
        if(loantype.equals("HomeLoan")){
            // perform some action
        }
        if(loantype.equals("PersonalLoan")){
            //perform some action
        }
        if(loantype.equals("CarLoan")){
            //perform some action
        }
    }

    // in this we also not gonna add the new loan method.
}

