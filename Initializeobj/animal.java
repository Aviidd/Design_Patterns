package Initializeobj;
public class animal{

    public void eat(){
        System.out.println("noddy is eating");
    }
    public static void main(String[] args){
        System.out.println("Prashant Saini");
        animal noddy = new animal();
        noddy.eat();
        noddy.running();
        
    }
    public void running(){
        System.out.println("noddy am running");
    }
}