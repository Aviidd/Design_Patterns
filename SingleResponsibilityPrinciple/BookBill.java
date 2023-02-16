package SingleResponsibilityPrinciple;
// this class handle the total bill amount of the book
public class BookBill {
    private String name;
    private int quantity;
    private double total;
    private double discountRate;

    public BookBill(String name, int quantity, double total, double discountRate){
        this.name = name;
        this.quantity = quantity;
        this.total = total;
        this.discountRate = discountRate;
    }

    public double CalculateTotal(){
        // perform the calculate function
    }
}
