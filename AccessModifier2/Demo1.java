package AccessModifier2;
// this shows we can't access the default keyword outside the package 
public class Demo1 extends Demo3 {
    public static void main(String[] args) {
        Demo1 d = new Demo1();
        d.value = 20;
        System.out.println(d.value);
    }
}
