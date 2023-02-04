package Poly;
//example 2 of overloading
public class Test1 {
    void show(){
        System.out.println("1");
    }
    void show(int a){
        System.out.println("2");
    }
    
    public static void main(String[] args){
        Test1 t = new Test1();
        t.show(20);

    }
}
