package Interface;
// in this we gonna discuss about how to private method in interface works
// we can't call the private method directly through objects but we call it in default conrete method.
interface Test1 {
    private void show(){
        System.out.println("i am in private method 1");
    }

    private static void Avid(){
        System.out.println("i am in private method 2");
    }

    default void display(){
        show();
        Avid();
    }
}

class Abhinav implements Test1{
    public static void main(String [] args){
        Abhinav p = new Abhinav();
        p.display();
    }
}
