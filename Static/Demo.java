// in this we gonna discuss about the static block.
public class Demo {
    static int a; //writing the static variable. 
    static{
        a = 10;  //initializing the static variable.
        // executes 1
        System.out.println(" i am in static method 1");
    }
    public static void main(String[] args) {
        System.out.println("i am in main method");
    }
    static{
        //executes 2
        System.out.println(" i am in static method 2");
    }
}
//static block call automatically.
//first in the program the compiler will look all the static block, that are written, and execute it at class loading time, and call the main method
