package Interface;
// in this we gonna discuss what are the functions of interface 
// it is used to achieve loose coupling, used for multiple inhertance   
// we can't call private method directly (using objects).
interface Demo {
    // abstract method 
    public abstract void show();

    //fields
    public static final int n = 10; 
    // by default the compiler will add public static final

    //concrete method using default keyword
    default void display(){
        Prashant(); // calling the private method().
        System.out.println("i am in method with default keyword");
    }

    //concrete method using static keyword
    public static void print(){  
        //compiler automatically add the public method.
        Avid(); //calling the private method().
        System.out.println("i am in method with static keyword");
    }

    // we can call private methods using two types, first simply void and second is using static keyword and call it by putting in the default method.
    private void Prashant(){
        //private method 1.
        System.out.println("i am in private prashant method");
    }
    private static void Avid(){
        //private method 2.
        System.out.println("i am in private avid method");
    }
}
