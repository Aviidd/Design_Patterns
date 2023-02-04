package Inheritance;
// in this we gonna discuss single inheritance
public class Single {

    public static void main(String[] args){
        child c1 = new child();
        c1.id = 10;
        c1.name = "Prashant";

        System.out.println(c1.id + c1.name);
    }
}

 class Parent{
    int id;
    String name;
}

class child extends Parent{

}