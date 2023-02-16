package SingleResponsibilityPrinciple;

public class PrintInvoice {
    private PrintInvoice printInvoice;

    public PrintInvoice(PrintInvoice printInvoice) {
        this.printInvoice = printInvoice;
    }

    public void setPrintInvoice(){
        // in this method we gonna write the logic for printing the invoice
    }
    public void InvoicePdf(){
        // the logic for print the invoive into pdf
    }
    public void InvoiceWord(){
        // the logic for print the invoive into word
    }
    public void InvoiceDoc(){
        // the logic for print the invoive into Doc
    }

}
