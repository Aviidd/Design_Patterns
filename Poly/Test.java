package Poly;
// via using this what we do we overload the function, it means we have same name but diff arguments and we are calling.
public class Test {
    
    public static void main(String[] args){
        Prashant p = new Prashant();
        p.show();

    }
}

class Prashant{
    void show(){
        System.out.println("1");
    }
    void show(int a){
        System.out.println("2");
    }
}
