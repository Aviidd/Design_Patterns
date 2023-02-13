package ObjectCloning;
 // in this code we will see the concept of shallow copy 
 //this concept states we create one object and create two references to it, ig change any one of it than it will reflect to the other one also
public class Shallow {
    public static void main(String[] args) {
        Prashant obj = new Prashant();
        obj.i = 5;
        obj.j = 6;

        Prashant obj1 = obj;
        obj1.j = 8;
        System.out.println(obj1.i);  //5 and 8
        System.out.println(obj1.j);
        System.out.println(obj.i);  //5 and 6 
        System.out.println(obj.j);

    } 
}
class Prashant{
    int i;
    int j;
}
