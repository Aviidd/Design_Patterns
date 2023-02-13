package Constr;
// in this we are gonna discuss what is no arg constrctor
public class Ramesh {


    void show(){
        System.out.println("Ramesh is sleeping");
    }
    public Ramesh(){
        System.out.println("i am in no arg constructor");
        
    }

    public static void main(String [] args){
        Ramesh r1 = new Ramesh();
        r1.show();
    }
    
}
