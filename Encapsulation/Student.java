package Encapsulation;
public class Student {
    private int age;
    private int weight;
    
    //using getters and setters
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public static void main(String[] args){
        Student ob = new Student();
        ob.setAge(21);
        ob.setWeight(80);
        int stud1age = ob.getAge();
        int stud1Weight = ob.getWeight();
        System.out.println(stud1age); 
        System.out.println(stud1Weight);

        Student obj1 = new Student();
        obj1.setAge(22);
        obj1.setWeight(60);
        int stud2age = obj1.getAge();
        int stud2Weight = obj1.getWeight();
        System.out.println(stud2age); 
        System.out.println(stud2Weight);
    }
}
