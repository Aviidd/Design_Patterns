public class Test1 {
    // we can't use this and super keyword in static keyword.
    // in the we discuss about the static method
    // static method can only call the static data members not conrete data members
    int i = 10;
    static void display(){
        System.out.println("1");
        // print(); // static method only call the static method in the program 
    }

    void print(){
        display();  // but main method can call the static method
        System.out.println(" i am in print method");
    }
    public static void main(String[] args) {
        display();  // calling the static method within a class 
        Test1.display(); //calling the static method
        Test1 t1 = new Test1(); 
        t1.print();
        t1.display(); //calling static method through object, this will give warning.   
    }
}

