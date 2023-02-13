package ObjectCloning;
// in this we gonna discuss about the deep copy, we create a new object and manually adding the value to other.
public class Deep {
    public static void main(String[] args) {
        Avid ob = new Avid(); //creating one object.
        ob.i = 10;
        ob.j = 20;

        Avid obj = new Avid(); // creating second object.
        obj.i = ob.i ; //10
        obj.j = ob.j;  //20

        obj.i = 30;  //changing the value only reflect to the second object not the one object.
        obj.j = 40;
        System.out.println(ob);
        System.out.println(obj);
    }
}
class Avid{
    int i;
    int j;
    @Override
    public String toString() {
        return "Avid [i=" + i + ", j=" + j + "]";
    }
}
