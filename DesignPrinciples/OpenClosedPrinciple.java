public class OpenClosedPrinciple {
    // in this we gonna discuss and why we use the ocp principle,
    // in this we discuss the classes which not follow the ocp

// for eg -1
    class StatementDao{
        StatementDao statement;

        public StatementDao(StatementDao statement){
            // constructor
            this.statement = statement;
        }

        public void SaveToDb(){
            // save the class to db
        }
    }
    /*
    - this class is already tested
    -this class is live
    -this class is having live traffic
     */
    // a new requirement arises and we gonna save the file to file system, the  bad way to do is to make changes in the live file, as it is not recommended and prone to bugs

    class NewStatement{
        NewStatement newState;

        public NewStatement(StatementDao newState){
            // constructor
            this.newState=newState;
        }

        public void SaveToDb(){
            // save the class to db
        }
        public void saveTofile(){
            //save the class to file system
        }

        //solution is to make an interface apply the multiple inheritance concept via using this.
    }

    //for eg-2



}
