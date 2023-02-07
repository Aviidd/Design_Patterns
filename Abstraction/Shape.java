package Abstraction;

public abstract class Shape {
   abstract void spuare();
   abstract void rectangle();

}
class Prashant extends Shape{
    // @Override
    void square(){
        System.out.println("i am in square method");
    }
    void rectangle(){
        System.out.println("i am in rectangle method");
    }

}
    public static void main(String[] args){
        Prashant ob = new Prashant();
        ob.square();
        ob.rectangle();
    }

