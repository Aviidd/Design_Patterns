public class Test2 {
    // final keyword always used for parent class, jiss se hum inherit kr rhe hai.
    void show(){
        System.out.println("i am in class test2");
    }

    public static void main(String [] args){
        // Test2 t = new Test2();
        // t.show();
        prashant p = new prashant();
        p.show();
        
    }
}
class prashant extends Test2{
     void show(){
        System.out.println("i am in class prashant");
    }
}
