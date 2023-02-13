package Constr;

public class Demo {
    // in this program we have not initialized the constructor so the compiler will automatically call the default constructor 
    int age;
    public static void main(String[] args) {
        Demo d = new Demo();
        d.age = 10;

        System.out.println(d.age);
    }
}
