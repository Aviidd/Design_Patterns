package Static;
// in this program we gonna discuss how we use the static keyword to increase the count of number.
public class Count {
    static int digit = 0;
    // int digit = 0 than the output is 1 , 1, 1.

    void display(){
        digit++;
        System.out.println(digit);
    }
    public static void main(String[] args) {
        Count c1 = new Count();
        c1.display();
        Count c2 = new Count();
        c2.display();
        Count c3 = new Count();
        c3.display();
    }
}
