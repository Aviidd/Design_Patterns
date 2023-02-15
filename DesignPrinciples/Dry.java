public class Dry{
    // this code does not follow dry principle, this principle states that don't repeat yourself, to make it follow the design principle we have to edit the principles
    public void CSE(){
        System.out.println("This is computer science");
    }
    // Method 2
    // For cse dept. college
    public void college(){
        System.out.println("IIT - Madras");
    }
    // Method 3
    // ece dept method
    public void ECE(){
        System.out.println("This is electronics");
    }
    // Method 4
    // For ece dept college 1
    public void college1(){
        System.out.println("IIT - Madras");
    }
    // Method 5
    // For IT dept
    public void IT(){
        System.out.println(
                "This is Information Technology");
    }
    public static void main(String[] args) {
        Dry d = new Dry();
        d.CSE();
        d.college();
        d.ECE();
        d.college1();
        d.IT();
    }
}