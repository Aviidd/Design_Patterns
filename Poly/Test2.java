package Poly;
// in this example i am changing datatype of the functions
public class Test2 {

    void show(int a, String s){
        System.out.println("1");
    }
    void show(String s, int a){
        System.out.println("2");
    }
    void show(){
        System.out.println("3");
    }
    void show(int a){
        System.out.println("3");
    }

    public static void main(String[] args){
        Test2 t = new Test2();
        t.show(10, "Prashant");
        t.show("Prashant", 10);
    }
    
}
