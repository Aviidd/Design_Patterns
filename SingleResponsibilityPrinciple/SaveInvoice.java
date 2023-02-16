package SingleResponsibilityPrinciple;

public class SaveInvoice {
    private SaveInvoice saveInvoice;

    public SaveInvoice(SaveInvoice saveInvoice) {
        this.saveInvoice = saveInvoice;
    }

    public void SaveToDb(){
        // in this we gonna write the logic for the invoice to store in db.
    }
    public void SaveToFile(){
        // in this we gonna write the logic for the invoice to store in file.
    }
}
