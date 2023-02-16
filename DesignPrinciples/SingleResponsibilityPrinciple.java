public class SingleResponsibilityPrinciple {
    // this principle states that a class should have only one responsibility to perform.
    // in this class we gonna see that why we should learn this principle and what gonna happen if we don't use this

    //for eg-1

    class Marker{
        String name;
        String color;
        int year;
        int price;

        public Marker(String name,String color, int year, int price ) {
            // constructor of the class marker
            this.name = name;
            this.color = color;
            this.year = year;
            this.price = price;
        }
    }
    class Invoice{
        private Marker marker;
        private int quantity;

        public Invoice(Marker marker, int quantity) {
            //calling the constructor of invoice class
            this.marker = marker;
            this.quantity = quantity;
        }
        public int calculateTotal(){
            int price = ((marker.price) * this.quantity);
            return price;
        }
        public void printInvoice(){
            // print the invoice
        }
        public void SaveToDb(){
            // save the data into db
        }

        /*
        in this class invoice, we are calling three methods, one is calculate total, print invoice, save to db
        - calculate total is used to calculate the bill of the marker obtained.
        - print invoice is used to print the total invoice bill.
        - save to db method is used to save the data to db.

        this class doesn't follow the Single responisibility principle it has three ways to change
        - in future if we wanna include the gst in the bill, or some other tax than we have to change the main code, of invoice class and it also effect the other method
        - in future if we have to fax the invoice or change the type of our file from pdf to word, or to doc.
        - in future if we wanna add to the files rather than db
        so basically the invoice class is having three ways to change, code looks like smelly and hard to maintain
         */

    }


    // for eg-2
    class ServiceBank{
        private long amount;
        private String AccountNo;
        private String Loantype;
        private int otp;

        public ServiceBank(long amount, String AccountNo, String Loantype, int otp) {
            this.amount = amount;
            this.AccountNo = AccountNo;
            this.Loantype = Loantype;
            this.otp = otp;
        }

        void PrintPassbook(){
            // write the logic for printing the passbook
        }

        void GetLoanInterestInfo(String loantype){
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

        void sendOtp(String Medium){
            if(Medium.equals("email")){
                //perform some action

            }
            if(Medium.equals("MobileNo")){
                //perform some action
            }
        }

        /*
        this class has three ways to change
        - print passbook- if we gonna change the logic than what we have to do
        -getLoanInterestInfo- in future if we add the new loan type than we have to change the logic
        -sendOtp - if send the otp through new medium
         */
    }

    //for eg-3
    class Books{
        String name;
        String AuthorName;
        int year;
        int price;

        public Books(String name, String AuthorName, int year, int price){
            this.name = name;
            this.AuthorName = AuthorName;
            this.year = year;
            this.price = price;
        }
    }

    class Bill{
        private String name;
        private int quantity;
        private double total;
        private double discountRate;

        public Bill(String name, int quantity, double total, double discountRate){
            this.name = name;
            this.quantity = quantity;
            this.total = total;
            this.discountRate = discountRate;
        }

        public double CalculateTotal(){
            // perform the action
        }
        public void PrintInvoice(){
            // perform the action to print the invoice
        }
        public void Savefile(String filename){
            //perform the action
        }

        /*
        this class also conquer three types of change
        -calculate total if we include gst or any other tax than we need to change.
        -print the invoice of book, in future if we want to fax, or through any other medium.
        -save the file to db, in this we want to save the file in database or in filesystem.
         */

    }

}
