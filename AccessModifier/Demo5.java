package AccessModifier;
// protected keyword with in the same package
public class Demo5 {
    public static void main(String[] args) {
        Demo4 d = new Demo4();
        // d.age = 20;
        System.out.println(d.age);
    }
}
