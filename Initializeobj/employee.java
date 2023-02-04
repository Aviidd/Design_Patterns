package Initializeobj;
// in this we gonna initialize the object through constructor
public class employee {

    String name;
    int id;

    public employee(String name, int id){
        this.name = name;
        this.id = id;
    }

    public static void main(String[] args){
        employee e1 = new employee("Prashant", 101);
        employee e2 = new employee("abhinav", 102);

        System.out.println(e1.name + e1.id);
        System.out.println(e2.name + e2.id);

    }
}
