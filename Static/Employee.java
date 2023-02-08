package Static;
// in this program we gonna discuss how we gonna use the static keyword and via using this we save the memory.
public class Employee {
    int empid;
    String name;
    static String company = "Savant Tech";
    void display(){
    
        System.out.println(empid + " " + name + " " + company);
    }
    public Employee(int empid, String name, String company){
        this.empid = empid;
        this.name = name;
    }
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Prashant", "Savant Tech");
        e1.display();
        Employee e2 = new Employee(102, "Avid", "Savant Tech");
        e2.display();
    }

}

