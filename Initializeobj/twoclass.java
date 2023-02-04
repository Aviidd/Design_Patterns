package Initializeobj;
class twoclass {
    // in this program we gonna create two class, create object of one class and execute its method, and create object of second class and execute it.
    //without using inheritance.
    public static void main(String[] args){

        //creating object of one class and via creating its object, executes its method.
        twoclass obj = new twoclass();
        obj.eat();
        obj.running();
    
        //creating object of second class and via creating its object, executes its method.
        birds b = new birds();
        b.fly();
    }
     void eat(){
        System.out.println("Prashant is eating");
    }
     void running(){
        System.out.println("Prashant is running");
    }
}

class birds{
    public void fly(){
        System.out.println("bird is flying");
    }
}
