public class Learning {
    // in this program we gonna discuss about the super keyword, super keyword is a reference variable which is used to refer immediate parent class object.
    public static void main(String[] args){
        B ob = new B();
        ob.show(30);
    }
    
}
class A{  
    //parent class
    int a = 10;
}

class B extends A{
    //child class
    int a = 20;
    void show(int a){
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
    }


}