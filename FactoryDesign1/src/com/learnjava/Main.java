package com.learnjava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //create factory
        PlanFactory factory = new PlanFactory();

        //take input
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the plan name");
        String planName = scn.nextLine();
        System.out.println("Enter the amount of units");
        int units = scn.nextInt();

        Plan plan = factory.getPlan(planName);

        System.out.println("Plan name is :");
        System.out.print(planName);

        System.out.println("Rate is");
        plan.getRate();
        System.out.println(plan.amount);

        System.out.println("total bill is ");
        plan.calculate(units);
    }
}
