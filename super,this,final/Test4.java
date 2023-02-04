public class Test4 {

    // in this we gonna discuss why we need this, if we create a instance variable of samne name and meanwhile pass the same name to a function than the compiler confuses and it creates ambiguity.
    public static void main(String[] args){
        prashant p = new prashant();
        p.show(10);
        p.display();
    }
}
class prashant{
    int x; 
    void show(int x){
        this.x = x; // if we don't use the this keyword than this will throw the initialized value of instance variable that is 0. 
        // after using this it will display the 10 value.
    }
    void display(){
        System.out.println(x);
    }
}
