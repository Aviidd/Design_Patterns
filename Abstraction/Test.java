package Abstraction;
public abstract class Test {
    abstract void run();
    abstract int no();
}
class abhinav extends Test{
    int no(){
        System.out.println("i am in no method");
        return 0;
    }
    void run(){
        System.out.println("i am in abhinav class");
        // System.out.println(i);
    }
}
class prashant extends Test{
    // int i = 20;
    void run(){
        System.out.println("i am in run method");
        // System.out.println(i);
    }
    int no(){
        System.out.println("i am in no method");
        return 0;
    }

    public static void main(String [] args){
        // basically in this we have two method to create an object
        //1. via creating object of the child class and call its method.
        abhinav a = new abhinav();
        a.run();
        a.no();

        prashant p = new prashant();
        p.run();
        p.no();

        //2. via using the name of parent class and create the object of child class 

        // Test t = new abhinav();
        // t.run();

        // Test t1 = new prashant();
        // t1.run();

    }
}
