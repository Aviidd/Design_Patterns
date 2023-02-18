package FactoryMethodDesignPattern;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PlanFactory factory = new PlanFactory();

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the name of plan:" );

        String planName = scn.nextLine();
        System.out.println("Enter the number of units:");

        int units = scn.nextInt();

        //object creation
        Plan plan = factory.getPlan(planName);
        System.out.println("Plan name is:");
        System.out.println(planName);
        System.out.println("Rate is :");
        plan.getRate();
        System.out.println(plan.rate);
        System.out.println("Total Bill is:");
        plan.CalculateBill(units);
    }
}
