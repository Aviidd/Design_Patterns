package Inheritance;
// in this we discuss multilevel inheritance
public class Multilevel{
    public static void main(String[] args){
        prashant p1 = new prashant();
        p1.id = 101;
        p1.name = "Prashant";
    }
}


class Parent{
    int id;
    String name;
}

class child extends Parent{

}

class prashant extends child{

}