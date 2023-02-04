package Inheritance;
// in this we gonna discuss the hierarchical inheritance 
public class hierarchical{
    public static void main(String[] args){
        fulltime f1 = new fulltime();
        f1.id = 101; 
        f1.name = "Prashant";

        System.out.println("Prashant is working fulltime");
        System.out.println(f1.id + f1.name);

        intern i1 = new intern();
        i1.id = 102;
        i1.name = "abhinav";

        System.out.println("abhinav is working fulltime");
        System.out.println(i1.id + i1.name);
    }
}
class employee{
    String name;
    int id;
}

class intern extends employee{

}
class fulltime extends employee{

}