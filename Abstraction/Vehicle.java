package Abstraction;

public abstract class Vehicle {
    // int n; 
    abstract void start();
}
class Car extends Vehicle{
    void start(){
        System.out.println("car starts with key");
    }
}
class Scooter extends Vehicle{
    void start(){
        System.out.println(" scooter starts with kick");
    }

    public static void main(String [] args){
        Car c = new Car();
        c.start();
        Vehicle ob = new Car();
        ob.start();

        Scooter s = new Scooter();
        s.start();
        Vehicle obj = new Scooter();
        obj.start();
    }
}

