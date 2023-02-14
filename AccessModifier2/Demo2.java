package AccessModifier2;

import AccessModifier.Demo4;

// accessing protected keyword outside keyword by child class only
public class Demo2 extends Demo4{
    public static void main(String[] args) {
        Demo4 obj = new Demo4();
        System.out.println(obj.age);
    }
    
}
