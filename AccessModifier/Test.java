package AccessModifier;
// this test case show that we can't access the private access modifier within package.
public class Test {
    public static void main(String[] args) {
        Demo d = new Demo();
//        d.age;
    }
}
