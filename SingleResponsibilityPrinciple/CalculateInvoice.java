package SingleResponsibilityPrinciple;

public class CalculateInvoice {
    private Marker marker;
    private int quantity;

    public CalculateInvoice(Marker marker, int quantity) {
        //calling the constructor of invoice class
        this.marker = marker;
        this.quantity = quantity;
    }
    public int calculateTotal(){
        int price = ((marker.price) * this.quantity);
        return price;
    }
    public int gst(){
        int gst = 10;
        int price = ((marker.price) * gst * this.quantity);
    }
}
