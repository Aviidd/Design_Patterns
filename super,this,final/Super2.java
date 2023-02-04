public class Super2 {
    public static void main(String[] args){
        sahil ob = new sahil();
        ob.display(30);
    }
}
class Prashant{
    //parent class
    int a = 10;
}
class sahil extends Prashant{
    //child class
    int a = 20;
    void display(int a){
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
    }
}