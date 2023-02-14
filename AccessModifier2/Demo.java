package AccessModifier2;
import AccessModifier.Demo6;

// public keyword outside package by the child class only
public class Demo extends Demo6 {
    public static void main(String[] args) {
        Demo d = new Demo();
        System.out.println(d.age);
    }
}
