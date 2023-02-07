package Interface;
// in the we are discuss abstract method, concrete method, data fields
// in this the concrete method with static keyword is called through interface, not from class and object.
interface Test {

    public abstract void show();

    public static final int n = 10;

    default void print(){
        // display();
        System.out.println("i am in concrete method 1");
    }

    public static void display(){
        System.out.println("i am in concrete method 2");
    }
}
class Prashant implements Test{
    public void show(){
        //method overriding, the child class method access modifier is equal or greater than the parent class method access modifier 
        System.out.println("i am in abstract method");
    }

    public static void main(String [] args){
        Prashant p = new Prashant();
        p.print(); 
        Test.display();
        p.show();
    }

    // their are two ways to call the static method in interface, either call in other default concrete method, or call it from interface.

}
