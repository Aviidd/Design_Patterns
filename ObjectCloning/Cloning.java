package ObjectCloning;
// discuss object clone 
// by default the instance of java not allowed to clone the object (in order to provide the security) we have to do this via using cloneable interface, 
public class Cloning implements Cloneable{
    public static void main(String[] args) throws CloneNotSupportedException {

        Prashant ob = new Prashant();
        ob.i = 10;
        ob.j = 20;

        Prashant obj = (Prashant)ob.clone();
        System.out.println(ob);
        System.out.println(obj);
    }
}
class Prashant implements Cloneable{
    int i;
    int j;
    @Override
    public String toString() {
        return "Prashant [i=" + i + ", j=" + j + "]";
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
