package Constr;
// parameterized constructor
public class Suresh {
    int id;
    String name;

    public Suresh(int id, String name){
        this.id = id;
        this.name = name;
    }

    public static void main(String [] args){
        Suresh s1 = new Suresh(101, "Prashant");
        Suresh s2 = new Suresh(102, "Suresh");

        System.out.println(s1.id + s1.name);
        System.out.println(s2.id + s2.name);
    }
}
