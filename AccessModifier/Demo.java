package AccessModifier;
// in this we gonna discuss about the private access modifier, we can only access the private member with in the same class.
// the local variable will execute first and than the instance varible.
public class Demo{
    private static int age; //instance variable
    public static void main(String[] args) {
        Prashant ob = new Prashant();
        // ob.age = 20; // local variable 
        age = 30;
        System.out.println(age);
    }
}
class Prashant{
    
}