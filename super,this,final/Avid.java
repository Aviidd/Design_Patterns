public class Avid {
    // in this example we try to overload main method, yes we can overload main method, but the jvm only calls the original main method, if we call the other methods from main than it will call.
    public static void main(String[] args) {
        System.out.println("i am in original main method");
        main(98);
        main("prashant");
        main(2.03f);
        main(2.44553);
    }

    public static void main(int args) {
        System.out.println("i am in int main method");
    }

    public static void main(String args) {
        System.out.println("i am in string main method");
    }

    public static void main(float args) {
        System.out.println("i am in float main method");
    }
    public static void main(double args) {
        System.out.println("i am in double main method");
    }

}
