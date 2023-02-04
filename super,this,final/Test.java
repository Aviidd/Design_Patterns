public class Test {

    //final keyword to the variable, via using this no one can change the value, it is used in case of pi, gravitation force.
    public static void main(String[] args){
        int a = 10;
        a += 20;
        System.out.println(a);

        // by using final keyword
        final int b = 30;
        // b += 10;
        System.out.println(b);

    }
}
