package Initializeobj;
// in this we gonna initialize the object through reference variable, via using dot operator
//via creating object of the class and initialize the value.

public class obj1 {
    String color;
    int age;
    int weight;
    
    public static void main(String[] args){
        obj1 aa = new obj1();
        aa.age=21;
        aa.color="fair";
        aa.weight=80;

        System.out.println(aa.age  + aa.color  + aa.weight );
    }
}
