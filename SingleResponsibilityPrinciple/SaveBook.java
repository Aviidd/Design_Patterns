package SingleResponsibilityPrinciple;

public class SaveBook {
    String BookName;
    int Bookid;

    public SaveBook(String Bookname, int Bookid){
        this.BookName = Bookname;
        this.Bookid = Bookid;
    }

        public void saveToDb(){
            // perform the action to save the file in db.
        }
        public void SavetoFile(){
            //perform the action to sava the file in the file system.
        }

}
