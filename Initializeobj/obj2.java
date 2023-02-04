package Initializeobj;
// in this we gonna initialize the value through methods.
public class obj2 {
    String color;
    int weight;

    void initobj(String s, int w){
        color = s;
        weight = w;
    }

    void display(){
        System.out.println(color +" "+ weight);
    }
    public static void main(String [] args){
         obj2 a = new obj2();
        a.initobj("Prashant", 22);
        a.display();

    }
    
}
